package com.xxjqr.multiple_modules.core;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

@SpringBootConfiguration
public class CoreMapperConfig {


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.xxjqr.multiple_modules.core.*.mapper");//com.xxjqr.multiple_modules.core.*.mapper
        msc.setMarkerInterface(com.xxjqr.multiple_modules.core.comm.mapper.MyMapper.class);//自定义的顶层mapper,切记不能放在普通mapper包下,不能让spring扫描到
        //如果使用除了Mapper<T>接口之外的其他接口,需要在这里配置
        Properties properties = new Properties();
        properties.setProperty("mappers","tk.mybatis.mapper.common.Mapper,tk.mybatis.mapper.common.MySqlMapper");
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        msc.setProperties(properties);
        return msc;
    }
}