package com.xxjqr.multiple_modules.core.hotel;

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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"com.xxjqr.multiple_modules.core.hotel.mapper"}, sqlSessionFactoryRef = "hotelSqlSessionFactory")
public class HotelDBConfig {

    @Bean(name = "hotelProperties")
    @ConfigurationProperties(prefix = "spring.datasource.hotel")
    public DataSourceProperties properties(){
        return new DataSourceProperties();
    }

    @Bean(name = "hotelDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hotel")
    public DataSource hotelDataSource(/*@Qualifier("hotelDataSource") DataSourceProperties properties*/) {
        return DataSourceBuilder.create().build();
//        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
//        mysqlXaDataSource.setUrl(properties.getUrl());
//        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
//        mysqlXaDataSource.setUser(properties.getUserName());
//        mysqlXaDataSource.setPassword(properties.getPassword());
//
//        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
//        xaDataSource.setXaDataSource(mysqlXaDataSource);
//        xaDataSource.setUniqueResourceName("hotelDataSource");
//        return xaDataSource;
    }

    @Bean
    public SqlSessionFactory hotelSqlSessionFactory(@Qualifier("hotelDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(pathMatchingResourcePatternResolver.getResource("classpath:mybatis/mybatis-config.xml"));
//        factoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources("classpath:mybatis/hotel/*.xml"));
        return factoryBean.getObject();
    }

    @Bean(name="hotelTransactional")
    public DataSourceTransactionManager dataSoureTransactionManager(@Qualifier("hotelDataSource") DataSource datasource){
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(datasource);
        return tm;
    }
}
