package com.nebula.adapters.repositories;

import com.nebula.core.ports.SequenceRepository;

import org.springframework.stereotype.Component;

@Component
public class ThreadSequenceRepository implements SequenceRepository {

  @Override
  public Integer getSequence() {

    try {
      SharedCounter sharedCounter = SharedCounter.getInstance();
      return sharedCounter.getNextCount();
    } catch (Exception e) {
      return -1;
    }
  }
  
}
