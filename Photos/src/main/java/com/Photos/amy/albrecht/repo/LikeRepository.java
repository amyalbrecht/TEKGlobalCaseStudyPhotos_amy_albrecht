package com.Photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Photos.amy.albrecht.models.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
	Like countByLikeId(Integer likeId);

}
