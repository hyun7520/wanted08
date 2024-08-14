package com.wanted_24._8.challenge.post.service;

import com.wanted_24._8.challenge.exception.CustomException;
import com.wanted_24._8.challenge.exception.ErrorCode;
import com.wanted_24._8.challenge.post.domain.Post;
import com.wanted_24._8.challenge.post.dto.PostCreateDto;
import com.wanted_24._8.challenge.post.dto.PostUpdateDto;
import com.wanted_24._8.challenge.post.dto.PostViewDto;
import com.wanted_24._8.challenge.post.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public String createNewPost(PostCreateDto postCreateDto) {

        Post newPost = Post.builder()
                .title(postCreateDto.getTitle())
                .content(postCreateDto.getContent())
                .build();

        postRepository.save(newPost);

        return null;
    }

    public PostViewDto viewPost(Long id) {

        Post foundPost = postRepository.findById(id)
                .orElseThrow(() -> new CustomException(ErrorCode.EMAIL_IN_USER));

        return null;
    }

    public Page<PostViewDto> viewAllPosts(Pageable pageable) {

        return null;
    }

    public PostViewDto updatePost(Long id, PostUpdateDto postUpdateDto) {

        return null;
    }
}
