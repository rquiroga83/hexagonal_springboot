package com.nebula.adapters.repositories;

import java.util.Optional;

import com.nebula.core.domain.User;
import com.nebula.core.ports.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoUserRepository implements UserRepository {

  private SpringDataMongoUserRepository springDataMongoUserRepository;

  @Autowired
  public MongoUserRepository(SpringDataMongoUserRepository springDataMongoUserRepository){
    this.springDataMongoUserRepository = springDataMongoUserRepository;
  }

  @Override
  public User findById(Integer id) {

    Optional<User> user = springDataMongoUserRepository.findById(id);

    return user.isPresent() ? user.get() : null;
  }

  @Override
  public Integer save(User user) {
    springDataMongoUserRepository.save(user);

    return user.getId();
  }
  
}
