package com.xxjqr.multiple_modules.core.comm.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.xxjqr.multiple_modules.core.comm.annotation.MoneyAnno;
import com.xxjqr.multiple_modules.core.comm.util.MoneyUtil;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MoneySerializer extends JsonSerializer implements ContextualSerializer {

    Integer offset;
    Integer moneyType;
    MoneySerializer(){}

    MoneySerializer(Integer offset,Integer moneyType){
        super();
        this.moneyType = moneyType;
        this.offset=offset;
    }

    @Override
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(MoneyUtil.formatMoney((Integer)obj,moneyType,offset));
    }



    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        MoneyAnno anno = null;
        if (beanProperty != null) {
            anno = beanProperty.getAnnotation(MoneyAnno.class);
        }
        if (anno != null) {
            offset = Integer.valueOf(anno.offset());
            moneyType = Integer.valueOf(anno.moneyType());
        }
        return new MoneySerializer(offset,moneyType);
    }
}
