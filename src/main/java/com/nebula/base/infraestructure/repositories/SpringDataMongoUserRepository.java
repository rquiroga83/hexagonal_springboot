package com.nebula.base.infraestructure.repositories;

import com.nebula.base.domain.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpringDataMongoUserRepository extends MongoRepository<User, Integer>  {
  
}
