package com.project.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
	
	User findByEmail(String email);
	
	boolean existsByEmail(String email);
	
	
}
