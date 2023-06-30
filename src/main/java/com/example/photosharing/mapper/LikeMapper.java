package com.example.photosharing.mapper;

import com.example.photosharing.dto.LikeDto;
import com.example.photosharing.entity.Like;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LikeMapper {

    LikeDto toLikeDto(Like like);

    Like toLikeEntity(LikeDto like);

}
