package com.funtl.my.shop.dao.impl;

import com.funtl.my.shop.dao.UserDao;
import com.funtl.my.shop.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: wwx
 * Date: 2019/5/17
 * Time: 10:54
 */
@Service(value = "userDao")
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    User user = null;
    public User getUser(String email, String password) {
        logger.debug("调用 getUser(),参数为 email:{} password:{}",email,password);
        if ("admin@funtl.com".equals(email)) {
            if ("admin".equals(password)) {
                user = new User();
                user.setEmail("admin@funtl.com");
                user.setUsername("wwx");

                logger.info("成功获取 \"{}\"的用户信息",user.getUsername());
            }
        } else {
            logger.warn("获取 \"{}\"的用户信息失败",user.getUsername());
        }
        return user;
    }
}
