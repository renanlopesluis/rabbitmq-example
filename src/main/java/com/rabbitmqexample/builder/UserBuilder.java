package com.rabbitmqexample.builder;

import org.springframework.stereotype.Component;

import com.rabbitmqexample.model.User;

@Component
public class UserBuilder {

	public static User build(String name, Integer age) {
		return User.builder().name(name).age(age).build();
	}
}
