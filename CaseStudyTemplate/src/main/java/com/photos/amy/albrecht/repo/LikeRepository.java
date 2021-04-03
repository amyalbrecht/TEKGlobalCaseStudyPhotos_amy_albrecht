package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photos.amy.albrecht.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Integer> {

}
