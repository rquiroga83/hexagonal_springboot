package com.nebula.base.infraestructure.configuration;

import com.nebula.base.BaseApplication;
import com.nebula.base.domain.repositories.SequenceRepository;
import com.nebula.base.domain.repositories.UserRepository;
import com.nebula.base.domain.services.DomainUserService;
import com.nebula.base.domain.services.UserService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BaseApplication.class)
public class BeanConfiguration {

  @Bean
  UserService userService(
    final UserRepository userRepository, 
    final SequenceRepository sequenceRepository) {

      return new DomainUserService(userRepository, sequenceRepository);
  }
}
