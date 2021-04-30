package com.nebula.adapters.repositories;

import com.nebula.core.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpringDataMongoUserRepository extends MongoRepository<User, Integer>  {
  
}
