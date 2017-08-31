package com.xxjqr.multiple_modules.core.article.po;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by xxjqr on 2017/9/1.
 */
@Data
public class ArticleDto {
    @NotBlank(message = "title不能为空")
    private String title;
    @NotBlank(message = "summary不能为空")
    private String summary;
    @NotBlank(message = "text不能为空")
    private String text;
}
