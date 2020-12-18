package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.model.entity.Entry;
import com.project.model.entity.enums.EntryStatus;

public interface EntryService {
	
		Entry save(Entry entry);
		
		Entry update(Entry entry);
		
		void delete(Entry entry);
		
		List<Entry> getEntrys(Entry entryFilter);
		
		void changeStatus(Entry entry, EntryStatus status);
		
		void validateEntry(Entry entry);

		Optional<Entry> findById(Long Id);
}
