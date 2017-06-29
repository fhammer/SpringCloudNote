package com.play.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //启动EnableEureka客户端
public class SpringBootApp {
	public static void main(String[] args) {
//		SpringApplicationBuilder	
		SpringApplication.run(SpringBootApp.class, args);
	}
}
