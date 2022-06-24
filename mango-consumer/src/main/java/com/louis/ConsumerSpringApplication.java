package com.louis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringApplication.class,args);
    }
}
