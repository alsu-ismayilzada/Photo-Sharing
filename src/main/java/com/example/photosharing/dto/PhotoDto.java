package com.example.photosharing.dto;

import com.example.photosharing.entity.User;

import java.time.LocalDateTime;

public record PhotoDto(

        String url,
        LocalDateTime time
) {
}
