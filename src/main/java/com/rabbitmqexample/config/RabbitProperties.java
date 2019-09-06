package com.rabbitmqexample.config;

import org.springframework.stereotype.Component;

@Component
public class RabbitProperties {
	
	public static final String USER_EXCHANGE_NAME = "user";
	public static final String USER_QUEUE = "userqueue";
	public static final String USER_ROUTING_KEY = "userkey";
}
