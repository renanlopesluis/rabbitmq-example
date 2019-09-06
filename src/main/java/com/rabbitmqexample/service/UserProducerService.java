package com.rabbitmqexample.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rabbitmqexample.config.RabbitProperties;


@Service
@Qualifier("userProducerService")
public class UserProducerService<User> extends ProducerService<User>{

	@Override
	public void process(User user) {
	template.convertAndSend(RabbitProperties.USER_EXCHANGE_NAME, RabbitProperties.USER_ROUTING_KEY, user);
	System.out.println("The user "+user+" has been produced as a message");
		
	}

}
