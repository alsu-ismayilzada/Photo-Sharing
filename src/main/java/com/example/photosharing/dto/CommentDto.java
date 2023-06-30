package com.example.photosharing.dto;

import com.example.photosharing.entity.Photo;
import com.example.photosharing.entity.User;

import java.time.LocalDateTime;

public record CommentDto(

        String content ,
        LocalDateTime time
) {
}
