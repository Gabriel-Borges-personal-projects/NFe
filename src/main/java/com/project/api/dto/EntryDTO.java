package com.project.api.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.project.model.entity.User;
import com.project.model.entity.enums.EntryStatus;
import com.project.model.entity.enums.EntryType;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EntryDTO {
private Long id;
	
	private Integer mounth;
	
	private Integer year;
	
	private Long user;
	
	private BigDecimal value;
	
	private String description;
	
	private Timestamp date;
	
	private String type;
	
	private String status;
}
