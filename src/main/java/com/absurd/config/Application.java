package com.absurd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
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
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
