package com.wanted_24._8.challenge.post.controller;

import com.wanted_24._8.challenge.post.dto.PostCreateDto;
import com.wanted_24._8.challenge.post.dto.PostDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {

    @PostMapping("/api/post")
    @Operation(summary = "게시글 생성", description = "게시글을 생성합니다.")
    public ResponseEntity<PostDto> createPost(@RequestBody PostCreateDto postCreateDto) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }
}
