package com.photos.amy.albrecht.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.photos.amy.albrecht.entities.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
	Photo getPhotoByPhotoId(int id);

	Photo findPhotoByPhotoFileName(String photoFileName);
	
}
