package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository interface has an implementation class called SimpleJpaRepository it annotated with
// @Repository annotation and @Transactional
//@Repository
//@Transactional
public interface PostRepository extends JpaRepository<Post, Long> {
}
