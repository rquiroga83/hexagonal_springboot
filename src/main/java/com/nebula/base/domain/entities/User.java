package com.nebula.base.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
  private Integer id;
  private String username;
  private List<Role> roles;
  

  public User(Integer id, String username, ArrayList<Role> roles) {
    this.id = id;
    this.username = username;
    this.roles = roles;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public List<Role> getRoles() {
    return roles;
  }
}
