package com.company.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

//	@Bean
//	RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("auth-service", r -> r.path("/auth/**").uri("lb://auth-service"))
//				.route("loan-service", r -> r.path("/loan/**").uri("lb://loan-service"))
//				.route("user-service", r -> r.path("/user/**").uri("lb://user-service"))
//				.build();
//	}
}