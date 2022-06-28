package com.louis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Producer2SpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(Producer2SpringApplication.class,args);
    }
}
