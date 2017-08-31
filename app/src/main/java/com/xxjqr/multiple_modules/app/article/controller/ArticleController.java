package com.xxjqr.multiple_modules.app.article.controller;

import com.xxjqr.multiple_modules.app.article.service.ArticleService;
import com.xxjqr.multiple_modules.core.article.po.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xxjqr on 2017/8/29.
 */
@RestController
@RequestMapping(value = "rest/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Article> listArticle(){
        return articleService.listArticle();
    }
}
