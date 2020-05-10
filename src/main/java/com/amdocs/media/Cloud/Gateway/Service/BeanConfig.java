package com.amdocs.media.Cloud.Gateway.Service;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class BeanConfig {
	
	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder.routes().route(r -> r.path("/assignment/profile/**").uri("http://localhost:9093/").id("profile-service"))
				.route(r -> r.path("/assignment/login**").uri("http://localhost:9091/").id("spring-amdocs-microservice"))
				.build();

	}


}
