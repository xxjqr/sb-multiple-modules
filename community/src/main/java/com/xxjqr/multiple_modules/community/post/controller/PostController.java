package com.xxjqr.multiple_modules.community.post.controller;

import com.xxjqr.multiple_modules.community.post.service.PostService;
import com.xxjqr.multiple_modules.core.community.po.Post;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xxjqr on 2017/8/27.
 */
@RestController
@RequestMapping(value = "/rest")
public class PostController {
    @Resource
    private PostService postService;

    @RequestMapping(value = "post/list")
    public List<Post> listPost(){
        return postService.listPost();
    }

    @PostMapping(value = "upload/img")
    public void createPost(@RequestParam(value="file")MultipartFile file){
    }
}
