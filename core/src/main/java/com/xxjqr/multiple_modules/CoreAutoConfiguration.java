package com.xxjqr.multiple_modules;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


/**
 * Created by xxjqr on 2017/8/26.
 */
@Configuration
@MapperScan("com.xxjqr.multiple_modules.core.*.mapper")
public class CoreAutoConfiguration {

//    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource datasource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath*:com/**/*Mapper.xml"));
        bean.setTypeAliasesPackage("com.xxjqr.multiple_modules.core.*.po");
        return bean.getObject();
    }
}
