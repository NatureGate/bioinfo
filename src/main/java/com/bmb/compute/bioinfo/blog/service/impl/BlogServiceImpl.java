package com.bmb.compute.bioinfo.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.bmb.compute.bioinfo.blog.bean.Blog;
import com.bmb.compute.bioinfo.blog.dao.BlogMapper;
import com.bmb.compute.bioinfo.blog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 942121483@qq.com
 * @since 2021-04-15
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    private BlogMapper mapper;

    @Override
    public List<Blog> list() {
        return mapper.selectList(null);
    }
}
