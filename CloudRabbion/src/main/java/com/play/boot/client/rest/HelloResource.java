package com.play.boot.client.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.play.boot.client.service.HelloService;

@RestController
public class HelloResource {
	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hello")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greeting() {
		return "Hello World!";
	}
}
