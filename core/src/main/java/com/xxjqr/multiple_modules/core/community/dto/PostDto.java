package com.xxjqr.multiple_modules.core.community.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by xxjqr on 2017/9/2.
 */
@Data
public class PostDto {
    @NotBlank(message = "标题不能为空")
    private String title;
    @NotBlank(message = "内容不能为空")
    private String content;
}
