package com.nebula.base.domain.services;

import com.nebula.base.domain.entities.User;

public interface UserService {
  public User getUserById(Integer id);

  public Integer createUser(User user);
}
