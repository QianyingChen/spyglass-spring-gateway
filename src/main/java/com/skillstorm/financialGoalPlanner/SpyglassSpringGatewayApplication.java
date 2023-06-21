package com.skillstorm.financialGoalPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpyglassSpringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpyglassSpringGatewayApplication.class, args);
	}

}
