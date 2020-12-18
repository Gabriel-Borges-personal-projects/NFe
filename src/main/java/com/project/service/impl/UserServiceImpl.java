package com.project.service.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.exception.AuthenticationException;
import com.project.exception.BusinessRuleException;
import com.project.model.entity.User;
import com.project.model.repository.UserRepository;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User authUser(String email, String password) {
		Optional<User> user = userRepository.findByEmail(email);
		
		if(!user.isPresent()) {
			throw new AuthenticationException("Email não cadastrado");
		}
		if(!user.get().getPassword().equals(password)) {
			throw new AuthenticationException("Senha incorreta");
		}
		
		return user.get();
	}

	@Override
	@Transactional
	public User saveUser(User user) {
		this.validatePassword(user.getPassword());
		this.validateEmail(user.getEmail());
		LocalDateTime date = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(date);
		user.setSingUpDate(timestamp);
		return userRepository.save(user);
	}

	@Override
	public void validateEmail(String email) {
		boolean exists = userRepository.existsByEmail(email);
		if(exists) {
			throw new BusinessRuleException("email já cadastrado");
		}
		
	}
	
	@Override
	public void validatePassword(String password) {
		
		if(password == null || password.equals("")) {
			throw new BusinessRuleException("Senha inválida para cadastro");
		}
	}

	@Override
	public Optional<User> findById(Long Id) {
		Optional<User> user = userRepository.findById(Id);
		if(!user.isPresent()) {
			throw new BusinessRuleException("Usuário de lançamento não existente");
		}
		return user;
		
	}
}
