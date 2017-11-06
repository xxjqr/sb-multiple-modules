package com.xxjqr.multiple_modules.core;

import com.xxjqr.multiple_modules.core.comm.mapper.MyMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class CoreConfiguration {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.xxjqr.multiple_modules.core.*.mapper");
        msc.setMarkerInterface(MyMapper.class);//自定义的顶层mapper,切记不能放在普通mapper包下,不能让spring扫描到
        //如果使用除了Mapper<T>接口之外的其他接口,需要在这里配置
        Properties properties = new Properties();
        properties.setProperty("mappers","tk.mybatis.mapper.common.Mapper,tk.mybatis.mapper.common.MySqlMapper");
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        msc.setProperties(properties);
        return msc;
    }
}