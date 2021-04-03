package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photos.amy.albrecht.entities.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
	Like countByLikeId(Integer id);

}
