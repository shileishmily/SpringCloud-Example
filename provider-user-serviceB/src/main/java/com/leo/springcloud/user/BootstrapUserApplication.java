package com.leo.springcloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BootstrapUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapUserApplication.class, args);
    }
}
