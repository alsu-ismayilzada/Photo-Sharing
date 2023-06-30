package com.example.photosharing.manager;

import com.example.photosharing.dto.LikeDto;
import com.example.photosharing.entity.Like;
import com.example.photosharing.mapper.LikeMapper;
import com.example.photosharing.repository.LikeRepository;
import com.example.photosharing.service.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class LikeManager implements LikeService {

    private final LikeRepository likeRepository;
    private final LikeMapper likeMapper;

    @Override
    public void add(LikeDto like) {
        likeRepository.save(likeMapper.toLikeEntity(like));
    }

    @Override
    public void deleteById(int id) {
        likeRepository.deleteById(id);
    }
}
