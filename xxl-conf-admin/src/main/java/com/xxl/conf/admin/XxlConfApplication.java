package com.xxl.conf.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author xuxueli 2018-06-08 20:55:06
 */
@EnableAutoConfiguration
@SpringBootApplication
public class XxlConfApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(XxlConfApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(XxlConfApplication.class, args);
    }

}