package com.example.photosharing.mapper;

import com.example.photosharing.dto.PhotoDto;
import com.example.photosharing.entity.Photo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhotoMapper {

    PhotoDto toPhotoDto(Photo photo);

    Photo toPhotoEntity(PhotoDto photo);
}
