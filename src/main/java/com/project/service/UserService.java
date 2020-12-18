package com.project.service;
import com.project.model.entity.User;

public interface UserService {

	User authUser(String email, String password);
	
	User saveUser(User user);
	
	void validateEmail(String email);
	
	void validatePassword(String password);
}
