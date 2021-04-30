package com.nebula.adapters.repositories;

import java.util.concurrent.Semaphore;

public class SharedCounter {
  private int count = 0;
  private Semaphore sem;
  private static SharedCounter instance;


  private SharedCounter() {
    this.sem = new Semaphore(1);
  }


  public static SharedCounter getInstance() {
    if(instance == null) {
      instance = new SharedCounter();
    } 

    return instance;
  }


  public int getNextCount() throws InterruptedException {
    sem.acquire();
    int nextCount = count++;
    sem.release();

    return nextCount;
  }
  
}
