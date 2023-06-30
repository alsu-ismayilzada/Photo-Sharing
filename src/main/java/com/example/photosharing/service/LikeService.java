package com.example.photosharing.service;

import com.example.photosharing.dto.LikeDto;
import com.example.photosharing.entity.Like;

public interface LikeService {

    void add(LikeDto like);

    void deleteById(int id);



}
