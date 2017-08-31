package com.xxjqr.multiple_modules.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by xxjqr on 2017/8/29.
 */
@Configuration
public class CoreConfiguration {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.xxjqr.multiple_modules.core.*.mapper");
        msc.setMarkerInterface(com.xxjqr.multiple_modules.core.comm.MyMapper.class);//自定义的顶层mapper,切记不能放在普通mapper包下,不能让spring扫描到
        //如果使用除了Mapper<T>接口之外的其他接口,需要在这里配置
        Properties properties = new Properties();
        properties.setProperty("mappers","tk.mybatis.mapper.common.Mapper,tk.mybatis.mapper.common.MySqlMapper");
        msc.setProperties(properties);
        return msc;
    }
}
