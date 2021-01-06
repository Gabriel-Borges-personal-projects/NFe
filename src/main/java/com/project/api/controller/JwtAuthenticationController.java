package com.project.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.dto.JwtRequest;
import com.project.api.dto.JwtResponse;
import com.project.api.dto.ResponseUserDTO;
import com.project.api.dto.UserDTO;
import com.project.config.JwtTokenUtil;
import com.project.exception.AuthenticationException;
import com.project.model.entity.User;
import com.project.service.UserService;
import com.project.service.impl.JwtUserDetailsService;


@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class JwtAuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		
		System.out.println("entrou");
		System.out.println(authenticationRequest.getUsername().toString() + " " + authenticationRequest.getPassword());
		
//		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
		UserDTO userDto = UserDTO.builder()
				.email(authenticationRequest.getUsername())
				.passwd(authenticationRequest.getPassword())
				.build();
		try {
			User user = userService.authUser(userDto.getEmail(), userDto.getPasswd());
			ResponseUserDTO responseUser = ResponseUserDTO.builder()
					.id(user.getId())
					.name(user.getName())
					.email(user.getEmail())
					.build();
//			return ResponseEntity.ok(responseUser);
		}
		catch(AuthenticationException e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(userDto.getEmail());
		
		final String token = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new JwtResponse(token));
	}
	
	private void authenticate(String username, String password) throws Exception {
		System.out.println("entrou no auth");
	try {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		System.out.println("try do auth");
	} catch (DisabledException e) {
		System.out.println("disabled");
		throw new Exception("USER_DISABLED", e);
	} catch (BadCredentialsException e) {
		System.out.println("invalid");
		throw new Exception("INVALID_CREDENTIALS", e);
	}
	}
}