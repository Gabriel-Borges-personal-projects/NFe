package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.exception.BusinessRuleException;
import com.project.model.entity.User;
import com.project.model.repository.UserRepository;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User authUser(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validateUser(String email) {
		boolean exists = userRepository.existsByEmail(email);
		if(exists) {
			throw new BusinessRuleException("email já cadastrado");
		}
		
	}

}
