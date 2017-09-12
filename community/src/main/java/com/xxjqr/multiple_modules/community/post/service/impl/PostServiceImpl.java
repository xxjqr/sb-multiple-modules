package com.xxjqr.multiple_modules.community.post.service.impl;

import com.xxjqr.multiple_modules.community.post.service.PostService;
import com.xxjqr.multiple_modules.core.community.dto.PostDto;
import com.xxjqr.multiple_modules.core.community.mapper.PostMapper;
import com.xxjqr.multiple_modules.core.community.po.ActServe;
import com.xxjqr.multiple_modules.core.community.po.ActivityServe;
import com.xxjqr.multiple_modules.core.community.po.Post;
import com.xxjqr.multiple_modules.exception.BusinessException;
import com.xxjqr.multiple_modules.web.WebResponse;
import org.springframework.beans.BeanUtils;
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
<<<<<<< HEAD
    public List<Post> listPost() {
        ActServe actServe = postMapper.listActAndServe();
        return null;
//        return postMapper.selectAll();
=======
    public WebResponse listPost() throws BusinessException {
        List<Post> posts = postMapper.selectAll();
        if(posts==null)
            throw new BusinessException(200,"没有帖子");
        return new WebResponse(200,"创建成功",posts);
    }

    /**
     * 创建帖子
     * @param postDto
     * @return
     */
    @Override
    public WebResponse createPost(PostDto postDto) {
        Post post = new Post();
        BeanUtils.copyProperties(postDto,post);
        postMapper.insert(post);
        return new WebResponse(200,"创建成功");
>>>>>>> 668d5650a210ca57bf0836995ab0ab6b3256cd11
    }

}
