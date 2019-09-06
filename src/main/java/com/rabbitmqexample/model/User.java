package com.rabbitmqexample.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;

}