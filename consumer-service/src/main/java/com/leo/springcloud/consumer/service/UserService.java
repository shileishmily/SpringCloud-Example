package com.leo.springcloud.consumer.service;

import com.leo.springcloud.consumer.hystric.UserServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service-provider", fallback = UserServiceHystric.class)  //服务提供者的名字
public interface UserService {

    @RequestMapping(value = "/user/info", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}