package com.nebula.base.application;

import com.nebula.base.domain.entities.User;

public class UserResponse {
  User user;

  public UserResponse(final User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }
}
