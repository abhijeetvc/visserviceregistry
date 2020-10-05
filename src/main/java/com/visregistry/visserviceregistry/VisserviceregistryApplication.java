package com.visregistry.visserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class VisserviceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisserviceregistryApplication.class, args);
	}

}
