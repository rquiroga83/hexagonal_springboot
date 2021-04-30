package com.nebula.adapters.controllers;

import com.nebula.core.domain.User;

public class UserResponse {
  User user;

  public UserResponse(final User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }
}
