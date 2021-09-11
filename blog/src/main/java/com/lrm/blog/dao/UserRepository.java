package com.lrm.blog.dao;

import com.lrm.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author li
 * @Date 9/8/21 10:33 AM
 * @Version 1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User  findByUsernameAndPassword(String username,String password);
}
