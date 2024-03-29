package com.rabbitmqexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmqexample.builder.UserBuilder;
import com.rabbitmqexample.model.User;
import com.rabbitmqexample.service.MessageService;


@RestController
@RequestMapping("rabbitmq")
public class UserResource {

	@Autowired
	@Qualifier("userProducerService")
	private MessageService<User> service;;
	
	@GetMapping("produce/{name}/{age}")
	public String produce(@PathVariable("name") final String name, @PathVariable("age") final Integer age) {
		service.process(UserBuilder.build(name, age));
		return "Published successfully";
	}
	
}
