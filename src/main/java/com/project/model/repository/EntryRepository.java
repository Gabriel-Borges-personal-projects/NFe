package com.project.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {

}
