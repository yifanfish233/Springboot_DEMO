package com.example.demo_springboot.mapper;

import com.example.demo_springboot.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface CommentMapper {
    @Select("select * from t_comment where id = #{id}")
    public Comment findById(Integer id);


    @Update("UPDATE t_comment SET content = #{content}, author = #{author} WHERE id = #{id}")
    public int updateComment(Comment comment);

}
