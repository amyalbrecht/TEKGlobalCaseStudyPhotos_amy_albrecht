package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photos.amy.albrecht.entities.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
