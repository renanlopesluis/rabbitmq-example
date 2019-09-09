package com.rabbitmqexample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rabbitmqexample.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

    public User findByName(String name);
    public List<User> findByAge(Integer age);
}
