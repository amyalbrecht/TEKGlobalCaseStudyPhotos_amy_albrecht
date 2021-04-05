package com.Photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Photos.amy.albrecht.models.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
	Tag getTagByTagId(Integer tagId);

	Tag findTagByTagName(String tagName);

}
