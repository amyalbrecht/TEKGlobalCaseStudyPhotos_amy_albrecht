package com.photos.amy.albrecht.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.photos.amy.albrecht.entities.User;
import com.photos.amy.albrecht.repo.UserRepository;

@Service
public class UserServices {
private UserRepository userRepository;
	
	@Autowired
	public UserServices(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}
	

	/* 
	 * Pseudo code for showing edit button for admin vs. regular users.
	 * 
	 * if user is admin {
	 * 	if user is regular {
	 *		if user.userId == photo.userId, show edit button
	 *		} else { 
	 *		don't show edit button
	 *		}
	 * show all edit buttons
	 * 	}
	 * 
	*/
	
	
	
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<User> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends User> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends User> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteInBatch(Iterable<User> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	
	public User getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends User> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<User> findById(Integer id) {
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

	
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	public <S extends User> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends User> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public <S extends User> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public User getUserByUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
