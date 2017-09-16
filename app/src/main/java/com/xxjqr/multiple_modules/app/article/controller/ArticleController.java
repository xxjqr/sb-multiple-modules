package com.xxjqr.multiple_modules.app.article.controller;

import com.xxjqr.multiple_modules.app.article.service.ArticleService;
import com.xxjqr.multiple_modules.comm.exception.BusinessError;
import com.xxjqr.multiple_modules.comm.exception.BusinessException;
import com.xxjqr.multiple_modules.core.article.po.Article;
import com.xxjqr.multiple_modules.core.article.po.ArticleDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    public List<Article> listArticle() throws BusinessException {
        Article article = null;
        if (article==null)
            throw new BusinessException(BusinessError.参数错误);
        return articleService.listArticle();
    }

    @PostMapping("")
    public void createArticle(@Valid ArticleDto articleDto){

    }
}
