package com.xxjqr.multiple_modules.app.article.controller;

import com.xxjqr.multiple_modules.app.article.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by xxjqr on 2017/8/29.
 */
@RestController
@RequestMapping(value = "rest/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

//    @GetMapping(value = "list")
//    public List<Article> listArticle() throws BusinessException {
//        Article article = null;
//        if (article==null)
//            throw new BusinessException(BusinessError.参数错误);
//        return articleService.listArticle();
//    }

}
