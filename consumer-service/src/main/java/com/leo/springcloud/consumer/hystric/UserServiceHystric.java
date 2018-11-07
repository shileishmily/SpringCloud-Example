package com.leo.springcloud.consumer.hystric;

import com.leo.springcloud.consumer.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystric implements UserService {
    @Override
    public String hello(String name){
        return "服务不可用 " + name;
    }
}