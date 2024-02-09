package com.myblog.myblog.service.impl;

import com.myblog.myblog.entity.Comment;
import com.myblog.myblog.entity.Post;
import com.myblog.myblog.exception.ResourceNotFoundException;
import com.myblog.myblog.payload.CommentDto;
import com.myblog.myblog.repository.PostRepository;
import com.myblog.myblog.repository.CommentRepository;
import com.myblog.myblog.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private PostRepository postRepository;
    private CommentRepository commentRepository;
    private ModelMapper modelMapper;

    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CommentDto createComment(CommentDto commentDto, long postId) {

        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with Id: " + postId)
        );

        Comment comment = new Comment();
        comment.setEmail(commentDto.getEmail());
        comment.setText(commentDto.getText());
        comment.setPost(post);

        Comment savedComment = commentRepository.save(comment);

        CommentDto dto = new CommentDto();
        dto.setComment_id(savedComment.getComment_id());
        dto.setEmail(savedComment.getEmail());
        dto.setText(savedComment.getText());

        return dto;

    }

    @Override
    public void deleteComment(long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public CommentDto updateComment(long id, CommentDto commentDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post not found by Id: " + id)
        );
        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Comment not found for id " + id)
        );

        Comment com = mapToEntity(commentDto);
        com.setComment_id(comment.getComment_id());
        com.setPost(post);
        Comment savedComment = commentRepository.save(com);
        return mapToDto(savedComment);


    }

    CommentDto mapToDto(Comment comment){
        CommentDto dto = modelMapper.map(comment, CommentDto.class);
        return dto;
    }

    Comment mapToEntity(CommentDto commentDto){
        Comment comment = modelMapper.map(commentDto, Comment.class);
        return comment;
    }
}
