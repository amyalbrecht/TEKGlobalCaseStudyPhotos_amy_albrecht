package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photos.amy.albrecht.entities.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
	Album getAlbumByAlbumId(int id);
	
	Album findAlbumByAlbumName(String albumName);

}
