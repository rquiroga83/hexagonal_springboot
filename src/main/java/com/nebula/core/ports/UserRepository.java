package com.nebula.core.ports;

import com.nebula.core.domain.User;

public interface UserRepository {
  User findById(Integer id);

  Integer save(User user);
}
