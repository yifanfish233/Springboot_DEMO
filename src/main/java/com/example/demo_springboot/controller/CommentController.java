package com.example.demo_springboot.controller;
import com.example.demo_springboot.entity.Comment;
import com.example.demo_springboot.mapper.CommentMapper;
import com.example.demo_springboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/get/{id}")
    public Comment findById(@PathVariable("id") int comment_id){
        Comment comment = commentService.findById(comment_id);
        return comment;
    }
    @PostMapping("/updateComment")
    public Comment updateComment(@RequestBody Comment newComment){
        Comment comment  = commentService.updateComment(newComment);
        return comment;
    }


}
