package com.project.api.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.dto.UserDTO;
import com.project.exception.AuthenticationException;
import com.project.exception.BusinessRuleException;
import com.project.model.entity.User;
import com.project.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/signUp")
	public ResponseEntity signUp(@RequestBody UserDTO userDto){
		User user = User.builder()
				.name(userDto.getName())
				.email(userDto.getEmail())
				.password(userDto.getPassword())
				.build();
		
		try {
			user = userService.saveUser(user);
			return new ResponseEntity(user, HttpStatus.CREATED);
		}catch (BusinessRuleException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	@PostMapping("/auth")
	public ResponseEntity authUser(@RequestBody UserDTO userDto) {
		try {
			User user = userService.authUser(userDto.getEmail(), userDto.getPassword());
			return ResponseEntity.ok(user);
		}
		catch(AuthenticationException e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
			
	}
	@GetMapping("/balance/{id}")
	public ResponseEntity getBalance(@PathVariable("id") Long Id) {
		try {
			BigDecimal balance = userService.getBalance(Id);
			return ResponseEntity.ok(balance);
		} catch (BusinessRuleException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}
	@GetMapping("/getUsers")
	public ResponseEntity getAllUsers() {
		try {
			List<User> users = userService.getAllUsers();
			return ResponseEntity.ok(users);
		} catch (BusinessRuleException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}
}
