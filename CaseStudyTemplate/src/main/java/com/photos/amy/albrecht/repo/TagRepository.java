package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photos.amy.albrecht.entities.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
