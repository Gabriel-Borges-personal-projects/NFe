package com.project.api.controller;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.dto.EntryDTO;
import com.project.api.dto.EntryStatusDTO;
import com.project.exception.BusinessRuleException;
import com.project.model.entity.Entry;
import com.project.model.entity.User;
import com.project.model.entity.enums.EntryStatus;
import com.project.model.entity.enums.EntryType;
import com.project.model.repository.UserRepository;
import com.project.service.EntryService;
import com.project.service.UserService;

@RestController
@RequestMapping("/api/entry")
public class EntryController {

	@Autowired
	private EntryService entryService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity saveEntry(@RequestBody EntryDTO entryDTO) {
		Entry entry = null;
		try {	
				entryDTO.setStatus(EntryStatus.PENDENTE.toString());
				entry = convertEntry(entryDTO);
				entryService.save(entry);
				return new ResponseEntity(entry, HttpStatus.CREATED);
				
		}catch (BusinessRuleException e) {
			return ResponseEntity.badRequest().body(e.getMessage());	
				
	}
	}
	public Entry convertEntry(EntryDTO entryDTO) {
		Entry entry = null;
		try {
				entry = Entry.builder()
				.description(entryDTO.getDescription())
				.year(entryDTO.getYear())
				.mounth(entryDTO.getMounth())
				.entryStatus(EntryStatus.valueOf(entryDTO.getStatus().toUpperCase()))
				.entryType(EntryType.valueOf(entryDTO.getType().toUpperCase()))
				.user(userService.findById(entryDTO.getUser()).get())
				.value(entryDTO.getValue())
				.build();
		}
		catch(Exception e) {
			throw new BusinessRuleException("Erro de conversão de dados: " + e.getMessage());
		}
		return entry;
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity updateEntry(@PathVariable("id") Long Id, @RequestBody EntryDTO entryDto) {
		return entryService.findById(Id).map(entry -> {
			try{
				Timestamp date = entry.getEntryDate();
				entry = convertEntry(entryDto);
				entry.setId(Id);
				entry.setEntryDate(date);
				entryService.update(entry);
				return ResponseEntity.ok(entry);
			}catch (BusinessRuleException e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}).orElseGet( () -> new ResponseEntity("Lançamento não encontrado", HttpStatus.BAD_REQUEST));
	}
	
	@PutMapping("/changeStatus/{id}")
	public ResponseEntity changeEntryStatus(@PathVariable("id") Long Id, @RequestBody EntryStatusDTO entryStatusDto) {
		return entryService.findById(Id).map(entry -> {
			try{
				entry.setEntryStatus(EntryStatus.valueOf(entryStatusDto.getStatus().toUpperCase()));
				entryService.update(entry);
				return ResponseEntity.ok(entry);
			}catch (Exception e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}).orElseGet( () -> new ResponseEntity("Lançamento não encontrado", HttpStatus.BAD_REQUEST));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteEntry(@PathVariable("id") Long Id) {
		return entryService.findById(Id).map(entry -> {
			try {
			entryService.delete(entry);
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			} catch (BusinessRuleException e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}).orElseGet(() -> new ResponseEntity("Lançamento não encontrado", HttpStatus.BAD_REQUEST));
	}
	
	@GetMapping
	public ResponseEntity searchEntries(
			@RequestParam(value = "description", required = false) String description,
			@RequestParam(value = "mounth", required = false) Integer mounth,
			@RequestParam(value = "year", required = false) Integer year,
			@RequestParam(value = "type", required = false) String type,
			@RequestParam(value = "user") Long userId)
	{			
		Optional<User> user;
		try{
			user = userService.findById(userId);
		} catch (BusinessRuleException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		Entry entry = Entry.builder()
				.description(description)
				.mounth(mounth)
				.year(year)
				.user(user.get())
				.entryType(type == null ? null : EntryType.valueOf(type.toUpperCase()))
				.build();
		List<Entry> entries = entryService.getEntrys(entry);
		return ResponseEntity.ok(entries);
	}
}
