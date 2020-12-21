package com.project.model.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.convert.Jsr310Converters;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.project.model.entity.enums.EntryStatus;
import com.project.model.entity.enums.EntryType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Entry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Integer mounth;
	
	private Integer year;
	
	@ManyToOne
	private User user;
	
	private BigDecimal value;
	
	private String description;
	
	@Column(name = "entry_date")
	private Timestamp entryDate;
	
	@Column(name = "entry_type")
	@Enumerated(value = EnumType.STRING)
	private EntryType entryType;
	
	@Column(name = "entry_status")
	@Enumerated(value = EnumType.STRING)
	private EntryStatus entryStatus;
	
}
