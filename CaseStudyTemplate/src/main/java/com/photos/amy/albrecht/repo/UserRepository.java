package com.photos.amy.albrecht.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photos.amy.albrecht.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
