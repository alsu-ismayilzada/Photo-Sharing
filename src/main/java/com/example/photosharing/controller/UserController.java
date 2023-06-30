package com.example.photosharing.controller;

import com.example.photosharing.dto.UserDto;
import com.example.photosharing.manager.UserManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserManager userManager;

    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }
    @PostMapping
    public void add(@RequestBody UserDto user){
        userManager.add(user);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id){
        userManager.deleteById(id);
    }
    @GetMapping("{id}")
    public UserDto getById(@PathVariable int id){
        return userManager.getById(id);
    }
    @GetMapping
    public List<UserDto> getAll(){
        return userManager.getAll();
    }
}
