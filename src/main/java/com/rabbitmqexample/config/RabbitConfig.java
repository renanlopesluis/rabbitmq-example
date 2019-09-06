package com.rabbitmqexample.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	
	@Bean
	public Binding getBinding() {
		return BindingBuilder.bind(getQueue()).to(getExchange()).with(RabbitProperties.USER_ROUTING_KEY);
	}
		
	@Bean
	public TopicExchange getExchange() {
		return new TopicExchange(RabbitProperties.USER_EXCHANGE_NAME);
	}
			
	@Bean
	public Queue getQueue() {
		return new Queue(RabbitProperties.USER_QUEUE);
	}
		
}
