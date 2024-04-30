package com.example.gatewayserver.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;


@Configuration
public class RouteConfiguration {
    // @Bean
    // public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route(p -> p
    //                     .path("/movies")
    //                     .filters(f -> f.addRequestHeader("Hello", "World"))
    //                     .uri("http://localhost:8081"))
    //             .build();
    // }
}
