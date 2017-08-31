package com.xxjqr.multiple_modules;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication(/*exclude = {MybatisAutoConfiguration.class}*/)
public class AppApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}
