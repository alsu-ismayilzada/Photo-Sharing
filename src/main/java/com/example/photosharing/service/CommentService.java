package com.example.photosharing.service;

import com.example.photosharing.dto.CommentDto;

import java.util.List;

public interface CommentService {

    void add(CommentDto comment);

    void deleteById(int id);

    List<CommentDto> getAll();

    void update(CommentDto comment, int id);

}
