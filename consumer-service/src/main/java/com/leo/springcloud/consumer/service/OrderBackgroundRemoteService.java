package com.leo.springcloud.consumer.service;

import com.leo.springcloud.consumer.hystric.OrderBackgroundRemoteServiceHystric;
import com.leo.springcloud.order.api.service.OrderRemoteService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "order-service-provider", fallback = OrderBackgroundRemoteServiceHystric.class)  //服务提供者的名字
public interface OrderBackgroundRemoteService extends OrderRemoteService {
}
