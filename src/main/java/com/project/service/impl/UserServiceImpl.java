package com.project.service.impl;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.exception.AuthenticationException;
import com.project.exception.BusinessRuleException;
import com.project.model.entity.Entry;
import com.project.model.entity.User;
import com.project.model.entity.enums.EntryStatus;
import com.project.model.entity.enums.EntryType;
import com.project.model.repository.EntryRepository;
import com.project.model.repository.UserRepository;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	EntryRepository entryRepository;
	
	@Override
	public User authUser(String email, String password) {
		Optional<User> user = userRepository.findByEmail(email);
		
		if(!user.isPresent()) {
			throw new AuthenticationException("Email não cadastrado");
		}
		if(!user.get().getPassword().equals(encryptPassword(password))) {
			throw new AuthenticationException("Senha incorreta");
		}
		
		return user.get();
	}

	@Override
	@Transactional
	public User saveUser(User user) {
		this.validateEmail(user.getEmail());
		LocalDateTime date = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(date);
		user.setSingUpDate(timestamp);
		user.setPassword(encryptPassword(user.getPassword()));
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
	public Optional<User> findById(Long Id) {
		Optional<User> user = userRepository.findById(Id);
		if(!user.isPresent()) {
			throw new BusinessRuleException("Usuário de lançamento não existente");
		}
		return user;
		
	}
	
	@Override
	public User findByEmail(String email) {
		Optional<User> user = userRepository.findByEmail(email);
		if(!user.isPresent()) {
			throw new BusinessRuleException("Usuário não existente");
		}
		return user.get();
		
	}

	@Override
	public BigDecimal getBalance(Long Id) {
		Optional<User> user = userRepository.findById(Id);
		BigDecimal balance = BigDecimal.ZERO;
		if(!user.isPresent()) {
			throw new BusinessRuleException("Usuário não encontrado.");
		}
		else {
		List<Entry> confirmedEntries = entryRepository.findByEntryStatusAndUser(EntryStatus.CONFIRMADO, user.get());
		for(Entry entry : confirmedEntries) {
			 if(entry.getEntryType().equals(EntryType.RECEITA)) {
				balance = balance.add(entry.getValue());
			 }else if(entry.getEntryType().equals(EntryType.DESPESA)){
				balance = balance.subtract(entry.getValue());
			 }
		}
		}
		return balance;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public User updateUserPassword(User user) {
		user.setPassword(encryptPassword(user.getPassword()));
		if(user.getRecoverPasswordHash() != null) {
			user.setRecoverPasswordHash(null);
		}
		return userRepository.save(user);
	}

	@Override
	public String encryptPassword(String password) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new BusinessRuleException(e.getMessage());
		}
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();

        for (byte b : digest)
            sb.append(String.format("%02x", b & 0xff));
        
		return sb.toString();
	}

	@Override
	public User findByHash(String hash) {
		Optional<User> user = userRepository.findByRecoverPasswordHash(hash);
		if(!user.isPresent()) {
			throw new BusinessRuleException("Solicitação de recuperação de senha não encontrada");
		}
		return user.get();
	}
}
