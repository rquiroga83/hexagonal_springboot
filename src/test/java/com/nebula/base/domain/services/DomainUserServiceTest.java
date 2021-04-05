package com.nebula.base.domain.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import com.nebula.base.domain.entities.User;
import com.nebula.base.domain.repositories.SequenceRepository;
import com.nebula.base.domain.repositories.UserRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DomainUserServiceTest {
	@Mock
	private UserRepository userRepository;

	@Mock
	private SequenceRepository sequenceRepository;

	private DomainUserService domainUserService;

	@BeforeEach
	public void setup() {
		this.domainUserService = new DomainUserService(userRepository, sequenceRepository);
	}

	@Test
	public void shouldGetUserById() {
		Integer id = 0;

		when(domainUserService.getUserById(anyInt())).thenReturn(new User(id, "", new ArrayList<>()));
		User user = domainUserService.getUserById(0);
		assertNotNull(user);
	}

	@Test
	public void shouldCreateUser() {
		User user = new User(0, "", new ArrayList<>());

		when(domainUserService.createUser(any(User.class))).thenReturn(0);
		Integer id = domainUserService.createUser(user);
		assertNotNull(id);
	}
}
