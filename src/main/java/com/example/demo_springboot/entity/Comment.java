package com.example.demo_springboot.entity;

import java.io.Serializable;

public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String content;
    private Integer aId;
    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getaId() {
        return aId;
    }
    public void setaId(Integer aId) {
        this.aId = aId;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", aId=" + aId +
                ", author='" + author + '\'' +
                '}';
    }
}
