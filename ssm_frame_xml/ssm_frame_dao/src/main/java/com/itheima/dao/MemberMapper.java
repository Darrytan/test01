package com.itheima.dao;

import com.itheima.pojo.Member;

/**
 * 会员操作类
 */
public interface MemberMapper {

    /**
     * 根据会员号, 查询会员信息
     * @param id
     * @return
     * @throws Exception
     */
    Member findMemberById(String id) throws Exception;
}
