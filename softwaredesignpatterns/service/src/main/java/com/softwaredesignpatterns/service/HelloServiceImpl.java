package com.softwaredesignpatterns.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService{

	@Override
	public String helloService() {
		return "Hello service";
	}
	
}
