package com.Photos.amy.albrecht.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Photos.amy.albrecht.models.Photo;
import com.Photos.amy.albrecht.repo.PhotoRepository;

@Service
public class PhotoServices {
private PhotoRepository photoRepository;
	
	@Autowired
	public PhotoServices(PhotoRepository photoRepository) {
		this.photoRepository = photoRepository;
	}
	
	public void savePhoto(Photo photo) {
		photoRepository.save(photo);
	}
	
	public Photo findPhotoByPhotoFileName(String photoFileName) {
		return photoRepository.findPhotoByPhotoFileName(photoFileName);
	}
	
	//autogenerated by Eclipse
	
	
	
	public List<Photo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Photo> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Photo> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Photo> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends Photo> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteInBatch(Iterable<Photo> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	
	public Photo getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Photo> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Photo> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Page<Photo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Photo> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<Photo> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Photo entity) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll(Iterable<? extends Photo> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends Photo> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Photo> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Photo> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public <S extends Photo> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Photo getPhotoByPhotoId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
