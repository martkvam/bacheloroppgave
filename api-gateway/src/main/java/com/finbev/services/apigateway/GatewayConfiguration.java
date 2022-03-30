package com.finbev.services.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    // Bruk denne dersom du ikke kjører docker compose
    /*
    @Bean
    public RouteLocator router(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p.path("/cases/**")
                        .uri("http://localhost:8100/cases/**"))
                .route(p -> p.path("/brokers/**")
                        .uri("http://localhost:8200/brokers/**"))
                .route(p -> p.path("/contract/**")
                        .uri("http://localhost:8300/contract/**"))
                .route(p -> p.path("/contracts/**")
                        .uri("http://localhost:8300/contracts/**"))
                //Test route
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("MyHeader", "Dette er en test"))
                        .uri("http://httpbin.org:80/"))
                .build();
    } */

    //Bruk denne dersom du kjører docker compose
    @Bean
    public RouteLocator router(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p.path("/cases/**")
                        .uri("http://case-service:8100/cases/**"))
                .route(p -> p.path("/brokers/**")
                        .uri("http://broker-service:8200/brokers/**"))
                .route(p -> p.path("/contract/**")
                        .uri("http://altinn-service:8300/contract/**"))
                .route(p -> p.path("/contracts/**")
                        .uri("http://altinn-service:8300/contracts/**"))
                //Test route
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("MyHeader", "Dette er en test"))
                        .uri("http://httpbin.org:80/"))
                .build();
    }
}
