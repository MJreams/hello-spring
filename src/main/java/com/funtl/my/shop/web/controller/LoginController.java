package com.funtl.my.shop.web.controller;

import com.funtl.my.shop.comments.context.SpringContext;
import com.funtl.my.shop.comments.utils.CookieUtils;
import com.funtl.my.shop.entity.User;
import com.funtl.my.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: wwx
 * Date: 2019/5/16
 * Time: 15:27
 */

public class LoginController extends HttpServlet {

    private UserService userService = SpringContext.getBean("userService");
    private static final String COOKIE_NAME_USER_INFO = "userInfo";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter(  "password");
        boolean isRemember = req.getParameter("isRemember") == null ? false : true;
        User login = userService.login(email, password);
        if (login != null) {
            if (isRemember) {
                //用户信息存储一周
                CookieUtils.setCookie(req,resp,COOKIE_NAME_USER_INFO,String.format("%s:%s",email,password),7 * 24 * 60 * 60);
            }
            resp.sendRedirect("/main.jsp");

        } else {
            req.setAttribute("message","用户名或者密码错误");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInfo = CookieUtils.getCookieValue(req, COOKIE_NAME_USER_INFO);
        System.out.println(userInfo);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
