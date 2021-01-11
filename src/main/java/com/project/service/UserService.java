package com.project.service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.project.model.entity.User;

public interface UserService {

	User authUser(String email, String password);
	
	User saveUser(User user);
	
	User updateUserPassword(User user);
	
	void validateEmail(String email);
	
	Optional<User> findById(Long Id);

	BigDecimal getBalance(Long Id);
	
	List<User> getAllUsers();

	User findByEmail(String email);

	User findByHash(String hash);
	
	String encryptPassword(String password);
	
}
