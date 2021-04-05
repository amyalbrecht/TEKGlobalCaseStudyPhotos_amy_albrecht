package com.Photos.amy.albrecht.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Photos.amy.albrecht.models.Comment;
import com.Photos.amy.albrecht.models.Like;
import com.Photos.amy.albrecht.models.Photo;
import com.Photos.amy.albrecht.models.User;
import com.Photos.amy.albrecht.services.UserServices;

@Controller
public class TestController {
	
	@Autowired
	private UserServices userServices;
	
	
	
	
	@RequestMapping("/")
	public String testHandler() {
		User user = new User("admin@admin.com", "password", "Ricardo", "Delahoz", true, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		userServices.addUser(user);
		return "index";
	}
	
	//User(String email, String password, String firstName, String lastName, boolean authLevel,
	//List<Photo> uPhotos, List<Comment> uComment, List<Like> uLike) 
	
	
}
