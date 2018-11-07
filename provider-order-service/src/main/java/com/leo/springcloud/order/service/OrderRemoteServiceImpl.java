package com.leo.springcloud.order.service;

import com.leo.springcloud.order.api.pojo.Order;
import com.leo.springcloud.order.api.service.OrderRemoteService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service("orderRemoteService")
public class OrderRemoteServiceImpl implements OrderRemoteService {
    @Override
    public String createOrder(String userId, String productId) {
        Order order = new Order();
        order.setOrderId(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        order.setProductId(productId);
        order.setProductName("月卡");
        order.setPrice(new BigDecimal(123.33));
        order.setUserId(userId);
        order.setCreateTime(new Date());

        return order.toString();
    }
}
