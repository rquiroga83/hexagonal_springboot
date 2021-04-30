package com.nebula.core.ports;

import com.nebula.core.domain.User;

public interface UserUseCase {
  public User getUserById(Integer id);

  public Integer createUser(User user);
}
