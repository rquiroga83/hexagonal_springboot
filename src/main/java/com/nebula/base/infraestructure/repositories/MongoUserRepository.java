package com.nebula.base.infraestructure.repositories;

import java.util.Optional;

import com.nebula.base.domain.entities.User;
import com.nebula.base.domain.repositories.UserRepository;

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

    return user.get();
  }

  @Override
  public Integer save(User user) {
    springDataMongoUserRepository.save(user);

    return user.getId();
  }
  
}
