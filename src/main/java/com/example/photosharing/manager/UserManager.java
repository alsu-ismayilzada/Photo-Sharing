package com.example.photosharing.manager;
import com.example.photosharing.dto.UserDto;
import com.example.photosharing.mapper.UserMapper;
import com.example.photosharing.repository.UserRepository;
import com.example.photosharing.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public void add(UserDto user) {
        userRepository.save(userMapper.toUserEntity(user));
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto getById(int id) {
        return userRepository.findById(id)
                .stream().map(userMapper::toUserDto)
                .findFirst().get();
    }

    @Override
    public List<UserDto> getAll() {
        return userRepository.findAll()
                .stream().map(userMapper::toUserDto)
                .toList();
    }
}
