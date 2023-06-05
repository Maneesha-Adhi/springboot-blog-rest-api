package com.springboot.blog.payload;

import lombok.Data;

@Data
public class PostDto {
    private long id;
    private String tittle;
    private String description;
    private String content;
}
