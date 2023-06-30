package com.example.photosharing.repository;

import com.example.photosharing.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo,Integer> {
}
