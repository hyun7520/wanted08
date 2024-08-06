package com.wanted_24._8.challenge.post.repository;

import com.wanted_24._8.challenge.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
