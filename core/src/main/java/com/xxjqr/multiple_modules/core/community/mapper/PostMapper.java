package com.xxjqr.multiple_modules.core.community.mapper;

import com.xxjqr.multiple_modules.core.comm.MyMapper;
import com.xxjqr.multiple_modules.core.community.po.ActServe;
import com.xxjqr.multiple_modules.core.community.po.Post;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xxjqr on 2017/8/27.
 */
public interface PostMapper extends MyMapper<Post>{
    ActServe listActAndServe();
}
