package com.simplegoods.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * API Gateway - Entry point for all client requests
 * 
 * Routes requests to appropriate microservices and handles
 * cross-cutting concerns like authentication and rate limiting.
 * 
 * Runs on port 9000
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
