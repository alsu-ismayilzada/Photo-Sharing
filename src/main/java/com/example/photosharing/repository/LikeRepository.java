package com.example.photosharing.repository;

import com.example.photosharing.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like,Integer> {
}
