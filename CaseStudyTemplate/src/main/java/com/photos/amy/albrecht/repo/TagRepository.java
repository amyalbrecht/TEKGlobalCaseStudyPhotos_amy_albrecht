package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photos.amy.albrecht.entities.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
	Tag getTagByTagId(int id);

}
