package com.xxjqr.multiple_modules.community.post.service;

import com.xxjqr.multiple_modules.core.community.dto.PostDto;
import com.xxjqr.multiple_modules.exception.BusinessException;
import com.xxjqr.multiple_modules.web.WebResponse;

/**
 * Created by xxjqr on 2017/8/27.
 */
public interface PostService {
    WebResponse listPost() throws BusinessException;

    WebResponse createPost(PostDto postDto);
}
