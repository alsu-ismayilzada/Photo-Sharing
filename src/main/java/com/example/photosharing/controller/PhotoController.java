package com.example.photosharing.controller;

import com.example.photosharing.dto.PhotoDto;
import com.example.photosharing.entity.Photo;
import com.example.photosharing.manager.PhotoManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photo")
public class PhotoController {

    private final PhotoManager photoManager;

    public PhotoController(PhotoManager photoManager) {
        this.photoManager = photoManager;
    }

    @PostMapping
    public void add(@RequestBody PhotoDto photo){
        photoManager.add(photo);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id){
        photoManager.deleteById(id);
    }
    @GetMapping("{id}")
    public PhotoDto getById(@PathVariable int id){
        return photoManager.getById(id);
    }
    @GetMapping
    public List<PhotoDto> getAll(){
        return photoManager.getAll();
    }
}
