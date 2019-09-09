package com.rabbitmqexample.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ProducerService<T> implements MessageService<T>{
	
	@Autowired
	protected RabbitTemplate template;
	
}
