package com.leo.springcloud.consumer.controller;

import com.leo.springcloud.consumer.service.OrderBackgroundRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderBackgroundRemoteService orderBackgroundRemoteService;

    @RequestMapping("/createOrder")
    public String create() {
        return orderBackgroundRemoteService.createOrder("3298", "P123");
    }
}
