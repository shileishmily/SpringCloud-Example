package com.leo.springcloud.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String getUser(){
       return restTemplate.getForObject("http://user-service-provider/user/info", String.class);
    }
}
