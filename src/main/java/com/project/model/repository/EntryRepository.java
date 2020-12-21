package com.project.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.entity.Entry;
import com.project.model.entity.User;
import com.project.model.entity.enums.EntryStatus;
import com.project.model.entity.enums.EntryType;

public interface EntryRepository extends JpaRepository<Entry, Long> {
	
	List<Entry> findByEntryStatusAndUser(EntryStatus entryStatus, User user);
	
}
