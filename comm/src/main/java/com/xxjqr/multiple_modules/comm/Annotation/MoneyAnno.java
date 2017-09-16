package com.xxjqr.multiple_modules.comm.Annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( {ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonSerialize(using = com.xxjqr.multiple_modules.comm.Serializer.MoneySerializer.class)
public @interface MoneyAnno {
    String moneyType() default "1";
    String offset() default "2";
}
