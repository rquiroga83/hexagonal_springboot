package com.nebula.configuration;

import com.nebula.adapters.repositories.SpringDataMongoUserRepository;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoUserRepository.class)
public class MongoDBConfiguration {
}
