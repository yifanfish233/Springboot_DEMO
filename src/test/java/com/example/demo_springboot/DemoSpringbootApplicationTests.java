package com.example.demo_springboot;

import com.example.demo_springboot.entity.Comment;
import com.example.demo_springboot.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class DemoSpringbootApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }
    @Test
    void selectComment(){
        Comment comment = commentMapper.findById(2);
        System.out.println(comment.getId()+ comment.getAuthor()+ comment.getContent()+comment.getaId());
    }

    @Test
    public void insertInRedis(){
        Comment comment = commentMapper.findById(2);
        redisTemplate.opsForValue().set(comment.getId().toString(),comment);
        System.out.println(comment.toString());
    }
    @Test
    public void getValFromRedis(){
        Comment commentFromRedis = (Comment) redisTemplate.opsForValue().get("2");
        System.out.println(commentFromRedis.toString());
    }

}
