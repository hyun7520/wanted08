package com.wanted_24._8.challenge.member.controller;

import com.wanted_24._8.challenge.member.dto.UserLoginDto;
import com.wanted_24._8.challenge.member.dto.UserRegisterDto;
import com.wanted_24._8.challenge.security.dto.JwtTokenDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class MemberController {

    @PostMapping("/register")
    @Operation(summary = "사용자 등록", description = "userRegisterDto로 받아온 정보를 등록")
    public ResponseEntity<String> register(@RequestBody UserRegisterDto userRegisterDto) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("temp");
    }

    @PostMapping("/login")
    @Operation(summary = "로그인", description = "userLoginDto로 사용자 인증")
    public ResponseEntity<JwtTokenDto> doLogin(@RequestBody UserLoginDto userLoginDto) {

        return ResponseEntity
                .status(HttpStatus.OK)
                //TODO: JwtTokenDto 구현 후 수정
                .body(new JwtTokenDto());
    }

    @PostMapping("/logout")
    @Operation(summary = "로그아웃", description = "로그아웃, DB에서 refresh token 삭제")
    public ResponseEntity<String> logoutUser( /* TODO: AuthenticationPrincipal 입력 */ ) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("로그아웃");
    }
}
