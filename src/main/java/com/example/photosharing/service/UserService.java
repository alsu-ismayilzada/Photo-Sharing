package com.example.photosharing.service;
import com.example.photosharing.dto.UserDto;
import com.example.photosharing.entity.User;
import java.util.List;

public interface UserService {

            void add(UserDto user);

            void deleteById(int id);

            UserDto getById(int id);

            List<UserDto> getAll();
}
