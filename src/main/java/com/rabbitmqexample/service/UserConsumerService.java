package com.rabbitmqexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.rabbitmqexample.config.RabbitProperties;

@Service
public class UserConsumerService<User> implements RabbitMQService<User>{

	private final static Logger log = LoggerFactory.getLogger(UserConsumerService.class);
	
	@RabbitListener(queues=RabbitProperties.USER_QUEUE)
	public void process(User user) {
		log.info("Message "+user+" has been consumed");	
	}
	
}
