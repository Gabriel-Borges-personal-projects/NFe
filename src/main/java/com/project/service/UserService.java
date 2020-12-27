package com.project.service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.project.model.entity.User;

public interface UserService {

	User authUser(String email, String password);
	
	User saveUser(User user);
	
	void validateEmail(String email);
	
	void validatePassword(String password);
	
	Optional<User> findById(Long Id);

	BigDecimal getBalance(Long Id);
	
	List<User> getAllUsers();
}
