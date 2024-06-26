package com.example.demo_springboot.service;

import com.example.demo_springboot.entity.Comment;

public interface CommentService {
    public Comment findById(int id);

    public Comment updateComment(Comment comment);
}
