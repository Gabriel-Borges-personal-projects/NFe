package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
//@Getter
//@Setter
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
@Data //substitui todos acima
@Builder //ex: User user = User.builder().name("gabriel").email("gab@gmail.com").build();
//@NoArgsConstructor //não pode ser usado com Builder
//@AllArgsConstructor -> ruim nesse caso devido id
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	

}
