package com.project.model.repository;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.project.model.entity.Entry;
import com.project.model.entity.enums.EntryStatus;
import com.project.model.entity.enums.EntryType;

import java.util.List;

import org.junit.jupiter.api.Test;

@ExtendWith(SpringExtension.class)
//@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EntryRepositoryTest {

	@Autowired
	EntryRepository entryRepository;
	
	@Test
	public void findByStatusAndType() {
	}
}
