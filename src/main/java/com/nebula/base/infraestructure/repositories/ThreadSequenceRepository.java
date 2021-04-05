package com.nebula.base.infraestructure.repositories;
import com.nebula.base.domain.repositories.SequenceRepository;

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
