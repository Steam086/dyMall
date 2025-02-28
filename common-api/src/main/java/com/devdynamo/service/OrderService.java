package com.devdynamo.service;

import com.devdynamo.entity.Order;
import java.util.List;

public interface OrderService {
    /**
     * 创建订单
     * @param order 订单的信息
     */
    void createOrder(Order order);

    /**
     * 获取订单
     * 获取指定用户的订单
     * @return 一个包含该用户订单的List
     */
    List<Order> listOrder(Long userId);

    /**
     * 获取指定id的订单
     * @param orderId 订单id
     * @return Order 对应id的订单
     */
    Order getOrder(Long orderId);

    /**
     * 删除订单
     * @param id 待删除的订单id
     */
    void deleteOrder(Long id);

    /**
     * 将订单标记为已支付
     * @param userId 用户id
     * @param orderId 订单id
     */
    void markOrderAsPaid(Long userId, Long orderId);

//    /**
//     * 可选，修改订单信息
//     * @param order 待修改的订单
//     */
//    void updateOrder(Order order);
//    /**
//     * 高级，订单定时取消
//     */
//    void cancel(){
//
//    }
}
