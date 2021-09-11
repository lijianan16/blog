package com.lrm.blog.service;

import com.lrm.blog.po.User;

/**
 * @Author li
 * @Date 9/8/21 10:26 AM
 * @Version 1.0
 */
public interface UserService {
    User checkUser(String username,String password);
}
