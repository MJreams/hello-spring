package com.funtl.my.shop.dao;

import com.funtl.my.shop.entity.User;

/**
 * Created by IntelliJ IDEA.
 * User: wwx
 * Date: 2019/5/17
 * Time: 10:53
 */
public interface UserDao {
    /**
     *  根据邮箱密码获取用户信息
     * @param email 邮箱
     * @param password 密码
     * @return  用户
     */
    public User getUser(String email, String password);
}