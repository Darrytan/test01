package com.itheima.dao;

import com.itheima.pojo.Traveller;

import java.util.List;

/**
 * 旅客操作类
 */
public interface TravellerMapper {

    /**
     * 根据订单编号查询旅客信息
     * @param orderId
     * @return
     * @throws Exception
     */
    List<Traveller> findTravellerByOrderId(String orderId) throws Exception;
}
