package com.example.demo_springboot.service.Impl;

import com.example.demo_springboot.entity.Comment;
import com.example.demo_springboot.mapper.CommentMapper;
import com.example.demo_springboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    RedisTemplate redisTemplate;
    public Comment findById(int id){
        // 想要先从redis中查询
        Object object = redisTemplate.opsForValue().get(String.valueOf(id));
        if(object == null){
            Comment comment = commentMapper.findById(id);
            redisTemplate.opsForValue().set(comment.getId().toString(),comment);
            return comment;
        }else{
            return (Comment) object;
        }


    }

    public Comment updateComment(Comment comment){
        int result = commentMapper.updateComment(comment);
        System.out.println(result);
        return comment;

    }

}
