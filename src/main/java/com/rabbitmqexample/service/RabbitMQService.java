package com.rabbitmqexample.service;

public interface RabbitMQService<T> {

	void process(T object);
}
