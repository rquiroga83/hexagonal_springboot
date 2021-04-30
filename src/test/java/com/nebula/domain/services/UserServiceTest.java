package com.nebula.domain.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import com.nebula.core.domain.User;
import com.nebula.core.ports.SequenceRepository;
import com.nebula.core.ports.UserRepository;
import com.nebula.core.services.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
	@Mock
	private UserRepository userRepository;

	@Mock
	private SequenceRepository sequenceRepository;

	private UserService userService;

	@BeforeEach
	public void setup() {
		this.userService = new UserService(userRepository, sequenceRepository);
	}

	@Test
	public void shouldGetUserById() {
		Integer id = 0;

		when(userService.getUserById(anyInt())).thenReturn(new User(id, "", new ArrayList<>()));
		User user = userService.getUserById(0);
		assertNotNull(user);
	}

}
