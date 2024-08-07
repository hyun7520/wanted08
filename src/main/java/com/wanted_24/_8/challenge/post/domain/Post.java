package com.wanted_24._8.challenge.post.domain;

import com.wanted_24._8.challenge.common.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Getter
@Slf4j
@Table(name = "Post")
@NoArgsConstructor
public class Post extends BaseEntity {

    @Column(name = "title")
    @NotBlank(message = "제목은 비어있을 수 없습니다.")
    private String title;

    @Column(name = "content")
    @NotBlank(message = "내용은 비어있을 수 없습니다.")
    private String content;

//    @ManyToOne
//    private CustomUser user;

//    @OneToMany(mappedBy = "postId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
