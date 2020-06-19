package com.baomidou.ant.order.service.impl;

import com.baomidou.ant.order.entity.Orders;
import com.baomidou.ant.order.mapper.OrdersMapper;
import com.baomidou.ant.order.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-06-19
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
