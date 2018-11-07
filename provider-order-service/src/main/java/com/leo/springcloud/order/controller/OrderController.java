package com.leo.springcloud.order.controller;

import com.leo.springcloud.order.api.service.OrderRemoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderRemoteService orderRemoteService;

    @RequestMapping(value = "/createOrder", method = RequestMethod.GET)
    public String createOrder() {
        return orderRemoteService.createOrder("3298", "P123");
    }
}