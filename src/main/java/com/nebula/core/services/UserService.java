package com.nebula.core.services;

import com.nebula.core.domain.User;
import com.nebula.core.ports.SequenceRepository;
import com.nebula.core.ports.UserRepository;
import com.nebula.core.ports.UserUseCase;

public class UserService implements UserUseCase {

  UserRepository userRepository;
  SequenceRepository sequenceRepository;

  public UserService(UserRepository userRepository, SequenceRepository sequenceRepository) {
    this.userRepository = userRepository;
    this.sequenceRepository = sequenceRepository;
  }

  @Override
  public User getUserById(Integer id) {
    return userRepository.findById(id);
  }

  @Override
  public Integer createUser(User user) {
    int sequence = sequenceRepository.getSequence();
    user.setId(sequence);
    
    return userRepository.save(user);
  }
  
}
