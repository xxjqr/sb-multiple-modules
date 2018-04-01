package com.xxjqr.multiple_modules.app.article.controller;

import com.xxjqr.multiple_modules.app.article.service.ArticleService;
import com.xxjqr.multiple_modules.comm.exception.BusinessException;
import com.xxjqr.multiple_modules.core.article.po.Article;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xxjqr on 2017/8/29.
 */
@RestController
@RequestMapping(value = "/rest/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @GetMapping(value = "list")
    public List<Article> listArticle() throws BusinessException {
        int i=0;
        return articleService.listArticle();
    }

}
