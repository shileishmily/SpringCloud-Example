package com.leo.springcloud.consumer.controller;

import com.leo.springcloud.consumer.service.UserRibbonService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user_ribbon")
public class UserRibbonController {

    @Resource
    private UserRibbonService userRibbonService;

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUser() {

        String userJSON = userRibbonService.getUser();
        System.out.println(userJSON);
        return userJSON;
    }
}