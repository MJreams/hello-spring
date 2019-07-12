package com.funtl.my.shop.service;

import com.funtl.my.shop.entity.User;

/**
 * Created by IntelliJ IDEA.
 * User: wwx
 * Date: 2019/5/16
 * Time: 14:03
 */
public interface UserService {
    /**
     *  登录
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    public User login(String email, String password);
}