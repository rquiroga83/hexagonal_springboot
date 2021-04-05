package com.nebula.base.infraestructure.repositories;

import java.util.ArrayList;

import com.nebula.base.domain.entities.User;
import com.nebula.base.domain.repositories.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class FakeUserRepository implements UserRepository {

  @Override
  public User findById(Integer id) {
    return new User(id, "", new ArrayList<>());
  }

  @Override
  public Integer save(User user) {
    return user.getId();
  }
  
}
