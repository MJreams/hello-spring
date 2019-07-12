package com.funtl.my.shop.entity;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: wwx
 * Date: 2019/5/13
 * Time: 16:59
 */

/**
 * 用户
 *
 * @description:
 * @param: ${tags}
 * @return: ${return_type}
 * @author: Dreams
 * @time: 2019/5/13 17:01
 */

public class User implements Serializable {
    private String username;
    private String password;
    private String email;
    private boolean isRemember;

    public boolean isRemember() {
        return isRemember;
    }

    public void setRemember(boolean remember) {
        isRemember = remember;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
