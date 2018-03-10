package com.xxjqr.multiple_modules.core.article.mapper;

import com.xxjqr.multiple_modules.core.article.po.Article;
import com.xxjqr.multiple_modules.core.comm.mapper.MyMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xxjqr on 2018/3/10.
 */
public interface ArticleMapper extends MyMapper<Article> {
    @Select("select * from t_article")
    List<Article> listArticle();
}
