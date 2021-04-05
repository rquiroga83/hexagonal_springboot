package com.nebula.base.domain.repositories;

import com.nebula.base.domain.entities.User;

public interface UserRepository {
  User findById(Integer id);

  Integer save(User user);
}
