package com.nebula.base.domain.services;

import com.nebula.base.domain.entities.User;
import com.nebula.base.domain.repositories.SequenceRepository;
import com.nebula.base.domain.repositories.UserRepository;

public class DomainUserService implements UserService {

  UserRepository userRepository;
  SequenceRepository sequenceRepository;

  public DomainUserService(UserRepository userRepository, SequenceRepository sequenceRepository) {
    this.userRepository = userRepository;
    this.sequenceRepository = sequenceRepository;
  }

  @Override
  public User getUserById(Integer id) {
    User user = userRepository.findById(id);

    return user;
  }

  @Override
  public Integer createUser(User user) {
    int sequence = sequenceRepository.getSequence();
    user.setId(sequence);
    
    Integer id = userRepository.save(user);

    return id;
  }
  
}
