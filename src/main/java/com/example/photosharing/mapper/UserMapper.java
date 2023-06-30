package com.example.photosharing.mapper;

import com.example.photosharing.dto.UserDto;
import com.example.photosharing.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    User toUserEntity(UserDto user);
}
