package com.louis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerSpringApplication.class);
    }
}
