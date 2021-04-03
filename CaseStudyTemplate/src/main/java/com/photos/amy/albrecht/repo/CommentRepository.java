package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photos.amy.albrecht.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
