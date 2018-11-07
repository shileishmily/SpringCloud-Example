package com.leo.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private int port;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;


    @RequestMapping("/name")
    public String name(){
        return this.toString();
    }

    @RequestMapping("/helloword")
    public String helloword() {
        return "helloword";
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//        c.setIgnoreUnresolvablePlaceholders(true);
//        return c;
//    }

    @Override
    public String toString() {
        return "ConfigClientApplication{" +
                "applicationName='" + applicationName + '\'' +
                ", port=" + port +
                ", eurekaServers='" + eurekaServers + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
