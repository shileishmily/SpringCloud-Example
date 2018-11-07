package com.leo.springcloud.consumer.controller;

import com.leo.springcloud.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libing
 * @desc
 * @date 2018/5/28 13:44
 */
@RestController
@RequestMapping("/user_hystric")
public class UserHystricController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "userInfo", method = RequestMethod.GET)
    public String test() {
        return userService.hello("libing");
    }

}
