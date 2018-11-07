package com.leo.springcloud.consumer.hystric;

import com.leo.springcloud.consumer.service.OrderBackgroundRemoteService;
import org.springframework.stereotype.Component;

@Component
public class OrderBackgroundRemoteServiceHystric implements OrderBackgroundRemoteService {
    @Override
    public String createOrder(String userId, String productId) {
        return "订单服务不可用";
    }
}
