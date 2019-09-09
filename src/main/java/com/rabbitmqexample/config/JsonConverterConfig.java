package com.rabbitmqexample.config;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class JsonConverterConfig {
	
	@Bean
	public Jackson2JsonMessageConverter messageConverter() {
		ObjectMapper mapper = new ObjectMapper();
		return new Jackson2JsonMessageConverter(mapper);
	}
	
	@Bean
	public RabbitTemplate templateConverter(final ConnectionFactory connectionFactory) {
		final RabbitTemplate template = new RabbitTemplate(connectionFactory);
		template.setMessageConverter(messageConverter());
		return template;
	}
	
	@Bean
    public SimpleRabbitListenerContainerFactory containerFactory(ConnectionFactory connectionFactory,
            SimpleRabbitListenerContainerFactoryConfigurer configurer) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        factory.setMessageConverter(messageConverter());
        return factory;
    }

}
