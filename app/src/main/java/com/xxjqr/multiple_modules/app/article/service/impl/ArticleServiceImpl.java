package com.xxjqr.multiple_modules.app.article.service.impl;

import com.xxjqr.multiple_modules.app.article.service.ArticleService;
import com.xxjqr.multiple_modules.comm.exception.BusinessError;
import com.xxjqr.multiple_modules.comm.exception.BusinessException;
import com.xxjqr.multiple_modules.core.article.mapper.ArticleMapper;
import com.xxjqr.multiple_modules.core.article.po.Article;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xxjqr on 2017/8/27.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Transactional(rollbackFor=Exception.class)
    @Override
    public List<Article> listArticle() throws BusinessException {
        Article article = new Article();
        article.setTitle("测试一把咯");
        article.setContent("测试一把又");
        articleMapper.insert(article);

//        if (true)
//            throw new BusinessException(BusinessError.参数错误);

        return articleMapper.listArticle();
    }
}
