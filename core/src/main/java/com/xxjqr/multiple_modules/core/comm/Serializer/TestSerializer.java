package com.xxjqr.multiple_modules.core.comm.Serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.xxjqr.multiple_modules.core.comm.Annotation.TestAnnotation;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Objects;

@Component
public class TestSerializer extends JsonSerializer implements ContextualSerializer{
    @Override
    public void serialize(Object t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        TestSerializer a = new TestSerializer();
        jsonGenerator.getCurrentValue();
        jsonGenerator.writeString(t+" aa");
    }

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        TestAnnotation anno = null;
        String field = null;
        if (beanProperty != null) {
            anno = beanProperty.getAnnotation(TestAnnotation.class);
        }
        if (anno != null) {
            field = anno.addValue();
        }
        String finalField = field;
        return new JsonSerializer() {
            @Override
            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
                System.out.println(o+ finalField);
                jsonGenerator.writeString(o+finalField);
            }
        };
    }
}
