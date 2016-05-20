package com.absurd.config;

import com.absurd.controller.IndexController;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2016/5/19.
 */
@Configuration
//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.absurd")
//@PropertySources(value = { @PropertySource(value = { "classpath*:application.propertis" }, ignoreResourceNotFound = true) })
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
