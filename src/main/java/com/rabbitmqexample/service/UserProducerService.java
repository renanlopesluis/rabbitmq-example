package com.rabbitmqexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rabbitmqexample.config.RabbitProperties;
import com.rabbitmqexample.model.User;
import com.rabbitmqexample.repository.UserRepository;

@Service
@Qualifier("userProducerService")
public class UserProducerService extends ProducerService<User>{

	@Autowired
	private UserRepository repository;
	
	@Override
	public void process(User user) {
		template.convertAndSend(RabbitProperties.USER_EXCHANGE_NAME, RabbitProperties.USER_ROUTING_KEY, user);
		user = repository.save(user);
		System.out.println("The user "+user+" has been produced as a message");	
	}

}
