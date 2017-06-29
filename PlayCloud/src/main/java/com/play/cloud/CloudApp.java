package com.play.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//@EnableDiscoveryClient
public class CloudApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CloudApp.class, args);
	}
}
