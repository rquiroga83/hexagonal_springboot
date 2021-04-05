package com.nebula.base.infraestructure.configuration;

import com.nebula.base.infraestructure.repositories.SpringDataMongoUserRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoUserRepository.class)
public class MongoDBConfiguration {
}
