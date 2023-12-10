package com.wob.wobProject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostImageDto {
    private Long postImageId;
    private Long categoryId;
    private String image;
}
