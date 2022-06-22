package com.louis.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages={"com.louis.*"})
public class MangoApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MangoApplication.class,args);
    }
}