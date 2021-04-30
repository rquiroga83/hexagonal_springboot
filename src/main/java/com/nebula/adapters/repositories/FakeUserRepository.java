package com.nebula.adapters.repositories;

import java.util.ArrayList;

import com.nebula.core.domain.User;
import com.nebula.core.ports.UserRepository;

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
