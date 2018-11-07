package com.leo.springcloud.order.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrderRemoteService {

    @RequestMapping(value = "/order/createOrder", method = RequestMethod.GET)
    String createOrder(@RequestParam("userId") String userId, @RequestParam("productId") String productId);
}
