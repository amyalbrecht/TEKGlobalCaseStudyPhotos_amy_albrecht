package com.Photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Photos.amy.albrecht.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User getUserByUserId(Integer userId);
	public User getUserByEmail(String email);
	public boolean existsByEmail(String email);
	public boolean existsByEmailAndPassword(String email, String password);

}
