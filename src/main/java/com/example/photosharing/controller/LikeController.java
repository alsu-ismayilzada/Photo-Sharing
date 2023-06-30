package com.example.photosharing.controller;
import com.example.photosharing.dto.LikeDto;
import com.example.photosharing.manager.LikeManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/like")
public class LikeController {

    private final LikeManager likeManager;

    public LikeController(LikeManager likeManager) {
        this.likeManager = likeManager;
    }
    @PostMapping
    public void add(@RequestBody LikeDto like){
        likeManager.add(like);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id){
        likeManager.deleteById(id);
    }
}




