package com.play.boot.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里主要是学习reset接口的初步实现
 * 
 * @author fuzh2
 *
 */
@RestController
public class HelloResource {

	@Value("${server.port}")
	String portStr;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String greeting() {
		return "Hello World!";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public List<String> hello2() {
		return Arrays.asList(new String[] { "A", "B", "C", portStr });
	}

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name) {
		return "Hello World!" + portStr + ": " + name;
	}
}
