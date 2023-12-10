package com.wob.wobProject.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class PostDto {
    private Long PostId;
    private String title;
    private Long categoryId;
    private String place;
    private int people;
    private int joiners;
    private Long expectationCost;
    private String introduction;
    private LocalDateTime date;
    private LocalDateTime regDate;
    private boolean isActive;
    private String postImage;
}
