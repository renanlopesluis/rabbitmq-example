package com.rabbitmqexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.rabbitmqexample.config.RabbitProperties;
import com.rabbitmqexample.model.User;

@Service
public class UserConsumerService implements RabbitMQService<User>{

	private final static Logger log = LoggerFactory.getLogger(UserConsumerService.class);
	
	@Override
	@RabbitListener(queues=RabbitProperties.USER_QUEUE, containerFactory="containerFactory")
	public void process(User user) {
		log.info("Message "+user+" has been consumed");	
	}
	
}
