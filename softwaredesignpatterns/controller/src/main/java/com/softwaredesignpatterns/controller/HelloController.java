package com.softwaredesignpatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwaredesignpatterns.service.HelloService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class HelloController {

	public final HelloService helloService;
	
	@GetMapping("/")
	public String getHello() {
		return helloService.helloService();
	}

}
