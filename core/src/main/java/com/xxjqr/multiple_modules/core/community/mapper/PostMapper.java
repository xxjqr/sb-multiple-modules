package com.xxjqr.multiple_modules.core.community.mapper;

import com.xxjqr.multiple_modules.core.comm.MyMapper;
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
//    @Select(value = "select * from t_post")
//    @Results({
//            @Result(id=true, column="id", property="id"),
//            @Result(column="title", property="title"),
//            @Result(column = "content",property = "content")
//    })
//    public List<Post> selectAll();

//    @Insert(value = "insert into t_post(title,content) values(#{title},#{content})")
//    public void createPost(Post post);
}
