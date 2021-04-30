package com.nebula.core.domain;

import java.util.UUID;

public class Role {
  private UUID id;
  private String name;

  public Role(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
