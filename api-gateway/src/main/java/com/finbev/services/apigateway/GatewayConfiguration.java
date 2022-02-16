package com.finbev.services.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator router(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p.path("/case**")
                        .uri("http://localhost:8081/"))
                //Test route
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("MyHeader", "Dette er en test"))
                        .uri("http://httpbin.org:80/"))
                .build();
    }
}
