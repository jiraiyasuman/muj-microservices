package com.mujunityfest_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MujunityfestApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MujunityfestApiGatewayApplication.class, args);
	}

}
