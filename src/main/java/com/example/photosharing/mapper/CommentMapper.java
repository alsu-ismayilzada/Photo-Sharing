package com.example.photosharing.mapper;

import com.example.photosharing.dto.CommentDto;
import com.example.photosharing.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    CommentDto toCommentDto(Comment comment);

    Comment toCommentEntity(CommentDto comment);

}
