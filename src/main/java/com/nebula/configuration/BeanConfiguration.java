package com.nebula.configuration;

import com.nebula.BaseApplication;
import com.nebula.core.ports.SequenceRepository;
import com.nebula.core.ports.UserRepository;
import com.nebula.core.services.UserService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BaseApplication.class)
public class BeanConfiguration {

  @Bean
  UserService userService (
    final UserRepository userRepository, 
    final SequenceRepository sequenceRepository) {

      return new UserService(userRepository, sequenceRepository);
  }
}
