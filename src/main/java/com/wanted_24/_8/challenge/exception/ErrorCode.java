package com.wanted_24._8.challenge.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "게시글이 존재하지 않습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
