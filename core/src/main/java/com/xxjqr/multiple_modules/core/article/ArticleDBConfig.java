package com.xxjqr.multiple_modules.core.article;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import com.xxjqr.multiple_modules.core.comm.po.DataSourceProperties;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"com.xxjqr.multiple_modules.core.article.mapper"}, sqlSessionFactoryRef = "articleSqlSessionFactory")
public class ArticleDBConfig {


    @Bean(name = "articleProperties")
    @ConfigurationProperties(prefix = "spring.datasource.article")
    public DataSourceProperties properties(){
        return new DataSourceProperties();
    }

    @Bean(name = "articleDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.article")
    public DataSource articleDataSource(/*@Qualifier("articleProperties") DataSourceProperties properties*/) {
        return DataSourceBuilder.create().build();
//        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
//        mysqlXaDataSource.setUrl(properties.getUrl());
//        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
//        mysqlXaDataSource.setUser(properties.getUserName());
//        mysqlXaDataSource.setPassword(properties.getPassword());
//
//        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
//        xaDataSource.setXaDataSource(mysqlXaDataSource);
//        xaDataSource.setUniqueResourceName("articleDataSource");
//        return xaDataSource;
//
    }


    @Primary
    @Bean(name = "articleSqlSessionFactory")
    public SqlSessionFactory articleSqlSessionFactory(@Qualifier("articleDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(pathMatchingResourcePatternResolver.getResource("classpath:mybatis/mybatis-config.xml"));
        factoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources("classpath:mybatis/article/*.xml"));
        return factoryBean.getObject();
    }

    @Bean(name="articleTransactional")
    public DataSourceTransactionManager dataSoureTransactionManager(@Qualifier("articleDataSource") DataSource datasource){
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(datasource);
        return tm;
    }

}
