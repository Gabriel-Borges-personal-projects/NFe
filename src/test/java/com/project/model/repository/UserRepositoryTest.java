package com.project.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.model.entity.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;
	
//	@Test
//	void existsByEmail() {
//		//cenário
//		User user = User.builder().name("gabriel").email("gabriel@gmail.com").build();
//		userRepository.save(user);
//		
//		//ação/execução
//		boolean exists = userRepository.existsByEmail(user.getEmail());
//		
//		//verificação
//		Assertions.assertThat(exists).isTrue();
//	}
}
