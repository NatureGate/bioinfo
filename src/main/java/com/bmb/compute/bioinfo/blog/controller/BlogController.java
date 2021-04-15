package com.bmb.compute.bioinfo.blog.controller;


import com.bmb.compute.bioinfo.blog.bean.Blog;
import com.bmb.compute.bioinfo.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 942121483@qq.com
 * @since 2021-04-15
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService service;
    @GetMapping("/all")
    public List<Blog> getBlogs(){
        return service.list();
    }
}
