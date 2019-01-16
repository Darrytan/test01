package com.itheima.dao;

import com.itheima.pojo.Orders;

import java.util.List;

public interface OrdersMapper {

    /**
     * 查询所有订单
     * @return
     * @throws Exception
     */
    List<Orders> findAll() throws Exception;


    /**
     * 根据订单id   查询订单详细信息
     * @param id
     * @return
     */
    Orders findOrderById(String id) throws Exception;
}
