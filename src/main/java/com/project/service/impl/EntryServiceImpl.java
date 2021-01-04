package com.project.service.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.exception.BusinessRuleException;
import com.project.model.entity.Entry;
import com.project.model.entity.User;
import com.project.model.entity.enums.EntryStatus;
import com.project.model.repository.EntryRepository;
import com.project.service.EntryService;

@Service
public class EntryServiceImpl implements EntryService{
	
	@Autowired
	private EntryRepository entryRepository;
	
	@Override
	@Transactional
	public Entry save(Entry entry) {
		this.validateEntry(entry);
		entry.setEntryStatus(EntryStatus.PENDENTE);
		LocalDateTime date = LocalDateTime.now();
		Timestamp timestamp = Timestamp.valueOf(date);
		entry.setEntryDate(timestamp);
		return entryRepository.save(entry);
	}

	@Override
	@Transactional
	public Entry update(Entry entry) {
		Objects.requireNonNull(entry.getId());
		this.validateEntry(entry);
		return entryRepository.save(entry);
	}

	@Override
	public void delete(Entry entry) {
		Objects.requireNonNull(entry.getId());
		entryRepository.delete(entry);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Entry> getEntrys(Entry entryFilter) {
		Example example = Example.of(entryFilter,
				ExampleMatcher
				.matching()
				.withIgnoreCase()
				.withStringMatcher(StringMatcher.CONTAINING));
		List<Entry> exampleList = entryRepository.findAll(example);
		List<Entry> entryList = entryRepository.findAllByOrderByIdDesc();
		List<Entry> finalList = new ArrayList<Entry>();
		for(Entry entry : entryList) {
			if(exampleList.contains(entry)) {
				finalList.add(entry);
			}
		}
		return finalList;
	}

	@Override
	public void changeStatus(Entry entry, EntryStatus status) {
		entry.setEntryStatus(status);
		this.update(entry);
		
	}

	@Override
	public void validateEntry(Entry entry) {
		if(entry.getDescription() == null || entry.getDescription().trim().equals("")) {
			throw new BusinessRuleException("O campo descrição é obrigatório");
		}
		if(entry.getMonth() == null) {
			throw new BusinessRuleException("O campo mês é obrigatório");
		}
		if(entry.getYear() ==  null) {
			throw new BusinessRuleException("O campo ano é obrigatório");
		}
		if(entry.getUser() == null || entry.getUser().getId() == null) {
			throw new BusinessRuleException("O campo usuário é obrigatório");
		}
		if(entry.getValue() == null || entry.getValue().compareTo(BigDecimal.ZERO)  < 1) {
			throw new BusinessRuleException("O campo valor é obrigatório");			
		}
		if(entry.getEntryType() == null) {
			throw new BusinessRuleException("O campo tipo é obrigatório");						
		}
		
	}

	@Override
	public Optional<Entry> findById(Long Id) {
		Optional<Entry> entry = entryRepository.findById(Id);
		if(!entry.isPresent()) {
			throw new BusinessRuleException("Lançamento não existente");
		}
		return entry;
	}

}
