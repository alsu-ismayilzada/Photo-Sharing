package com.example.photosharing.manager;

import com.example.photosharing.dto.CommentDto;
import com.example.photosharing.mapper.CommentMapper;
import com.example.photosharing.repository.CommentRepository;
import com.example.photosharing.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@AllArgsConstructor
public class CommentManager implements CommentService {

    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;
    public final CommentManager commentManager;

    @Override
    public void add(CommentDto comment) {
        commentRepository.save(commentMapper.toCommentEntity(comment));
    }

    @Override
    public void deleteById(int id) {
        commentRepository.deleteById(id);
    }

    @Override
    public List<CommentDto> getAll() {
        return commentRepository.findAll()
                .stream().map(commentMapper::toCommentDto)
                .toList();
    }

    @Override
    public void update(CommentDto comment, int id) {
        CommentDto com = commentRepository.findById(id)
                .stream().map(commentMapper::toCommentDto)
                .findFirst().get();

    }
}

