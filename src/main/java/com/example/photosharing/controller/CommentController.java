package com.example.photosharing.controller;

import com.example.photosharing.dto.CommentDto;
import com.example.photosharing.manager.CommentManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    private final CommentManager commentManager;

    public CommentController(CommentManager commentManager) {
        this.commentManager = commentManager;
    }

    @PostMapping
    public void add(@RequestBody CommentDto comment){
        commentManager.add(comment);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody CommentDto comment, @PathVariable int id){
        commentManager.update(comment,id);
    }
    @GetMapping
    public List<CommentDto> getAll(){
        return commentManager.getAll();
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id){
        commentManager.deleteById(id);
    }


}
