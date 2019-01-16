package com.itheima.dao;

import com.itheima.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository("productMapper")
public interface ProductMapper {

    /**
     * 查询所有产品信息
     * @return
     * @throws Exception
     */
    List<Product> findAll() throws Exception;


    /**
     * 添加产品
     * @param product
     * @throws Exception
     */
    int save(Product product) throws Exception;


    /**
     * 根据产品编号查询产品信息
     * @param id
     * @return
     * @throws Exception
     */
    Product findProductById(String id) throws Exception;
}
