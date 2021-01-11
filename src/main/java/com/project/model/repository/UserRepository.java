package com.project.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByName(String name);
	
	Optional<User> findByEmail(String email);
	
	Optional<User> findByRecoverPasswordHash(String hash);
	
	boolean existsByEmail(String email);
	
	
}
