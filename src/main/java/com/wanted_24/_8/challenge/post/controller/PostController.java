package com.wanted_24._8.challenge.post.controller;

import com.wanted_24._8.challenge.post.dto.PostCreateDto;
import com.wanted_24._8.challenge.post.dto.PostUpdateDto;
import com.wanted_24._8.challenge.post.dto.PostViewDto;
import com.wanted_24._8.challenge.post.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/post")
    @Operation(summary = "게시글 생성", description = "게시글을 생성합니다.")
    public ResponseEntity<PostCreateDto> createPost(@RequestBody PostCreateDto postCreateDto) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @GetMapping("/post/{postId}")
    @Operation(summary = "게시글 조회", description = "게시글 id를 통한 개별 조회")
    public ResponseEntity<PostViewDto> viewPost(@PathVariable(name = "postId") Long postId) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @GetMapping("/all-post")
    @Operation(summary = "전체 게시글 조회", description = "전체 게시글 조회, 페이징 적용")
    public ResponseEntity<PostViewDto> viewAllPost(Pageable pageable) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }

    @PatchMapping("/post/{postId}")
    @Operation(summary = "게시글 수정", description = "게시글 ID를 통해 수정")
    public ResponseEntity<PostViewDto> updatePost(@RequestBody PostUpdateDto postUpdateDto) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(null);
    }
}
