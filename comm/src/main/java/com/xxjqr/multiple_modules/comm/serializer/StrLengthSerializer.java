package com.xxjqr.multiple_modules.comm.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.xxjqr.multiple_modules.comm.annotation.StrLengthAnno;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StrLengthSerializer extends JsonSerializer implements ContextualSerializer {

    Integer count;
    String suffix;
    StrLengthSerializer(){}

    StrLengthSerializer(Integer count,String suffix){
        super();
        this.suffix = suffix;
        this.count=count;
    }

    @Override
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        String content = (String) obj;
        jsonGenerator.writeString(content.length()>count?content.substring(0,count)+suffix:content);
    }



    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        StrLengthAnno anno = null;
        if (beanProperty != null) {
            anno = beanProperty.getAnnotation(StrLengthAnno.class);
        }
        if (anno != null) {
            count = Integer.valueOf(anno.count());
            suffix = anno.suffix();
        }
        return new StrLengthSerializer(count,suffix);
    }
}
