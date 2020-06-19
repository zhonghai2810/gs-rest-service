package com.baomidou.ant.order.controller;


import com.baomidou.ant.order.entity.Orders;
import com.baomidou.ant.order.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-06-19
 */
@RestController
@RequestMapping("/order/orders")
public class OrdersController {

    @Autowired
    IOrdersService iOrdersService;

    @PostMapping
    public Orders getOrderById(@RequestBody Object object) {

    }
}
