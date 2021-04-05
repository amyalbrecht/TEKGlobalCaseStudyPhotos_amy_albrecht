package com.Photos.amy.albrecht.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Photos.amy.albrecht.models.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
	Photo getPhotoByPhotoId(Integer photoId);

	Photo findPhotoByPhotoFileName(String photoFileName);
	
}
