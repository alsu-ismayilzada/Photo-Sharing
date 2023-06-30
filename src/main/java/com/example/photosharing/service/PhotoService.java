package com.example.photosharing.service;

import com.example.photosharing.dto.PhotoDto;
import com.example.photosharing.entity.Photo;

import java.util.List;

public interface PhotoService {

    void add(PhotoDto photo);

    void deleteById(int id);

    PhotoDto getById(int id);

    List<PhotoDto> getAll();
}
