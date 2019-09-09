package com.rabbitmqexample.service;

public interface MessageService<T> {

	void process(T object);
}
