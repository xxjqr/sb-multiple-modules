package com.xxjqr.multiple_modules.community.post.controller;

import com.xxjqr.multiple_modules.community.post.service.PostService;
import com.xxjqr.multiple_modules.core.community.dto.PostDto;
import com.xxjqr.multiple_modules.core.community.po.Post;
import com.xxjqr.multiple_modules.exception.BusinessException;
import com.xxjqr.multiple_modules.web.WebResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    public WebResponse listPost() throws BusinessException {
        return postService.listPost();
    }

    @PostMapping(value = "post")
    public WebResponse createPost(@Valid @RequestBody  PostDto postDto){
        return postService.createPost(postDto);
    }

    @PostMapping(value = "upload/img")
    public WebResponse createPost(@RequestParam(value="file")MultipartFile file){
        return null;
    }
}
