package com.project.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.dto.UserDTO;
import com.project.exception.BusinessRuleException;
import com.project.model.entity.User;
import com.project.service.EmailService;
import com.project.service.UserService;

@RestController
@CrossOrigin //para habilitar cors
@RequestMapping("/api/email")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/recoverPassword")
	public ResponseEntity recoverPassword(@RequestBody UserDTO userDto) {
		
		try {
			
			User user = userService.findByEmail(userDto.getEmail());
			emailService.sendRecoverPasswordEmail();
			return new ResponseEntity(user.getId(), HttpStatus.OK);
			
		}catch(BusinessRuleException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}

}
