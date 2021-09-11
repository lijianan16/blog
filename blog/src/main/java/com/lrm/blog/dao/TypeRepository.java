package com.lrm.blog.dao;

import com.lrm.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author li
 * @Date 9/9/21 7:05 PM
 * @Version 1.0
 */
public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String name);

}
