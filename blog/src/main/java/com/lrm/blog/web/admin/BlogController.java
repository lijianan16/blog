package com.lrm.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author li
 * @Date 9/8/21 2:19 PM
 * @Version 1.0
 */
@Controller
@RequestMapping("/admin")
public class BlogController {
    @GetMapping("/blogs")
    public String list(){

        return "admin/blogs";
    }
}
