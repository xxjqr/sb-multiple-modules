package com.xxjqr.multiple_modules.community.post.service.impl;

import com.xxjqr.multiple_modules.community.post.service.PostService;
import com.xxjqr.multiple_modules.core.community.mapper.PostMapper;
import com.xxjqr.multiple_modules.core.community.po.Post;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xxjqr on 2017/8/27.
 */
@Service
public class PostServiceImpl implements PostService {
    @Resource
    private PostMapper postMapper;

    @Override
    public List<Post> listPost() {
        return postMapper.selectAll();
    }

//    @Override
//    public void createPost(Post post) {
//        postMapper.createPost(post);
//    }
}
