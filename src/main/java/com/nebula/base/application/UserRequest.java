package com.nebula.base.application;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nebula.base.domain.entities.User;

public class UserRequest {

  private User user;

  @JsonCreator
  public UserRequest(@JsonProperty("user") User user) {
    this.user = user;
  }
  
  public User getUser() {
    return user;
  }

}
