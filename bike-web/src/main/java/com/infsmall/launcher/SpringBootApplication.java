package com.infsmall.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableAutoConfiguration
@ComponentScan("com.infsmall")
//@EnableJpaRepositories("com.infsmall")
//@EntityScan("com.infsmall")
public class SpringBootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }


}
