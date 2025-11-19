package com.jspbank.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApiGatewayConfiguration {

   /* @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){

        return builder.routes()
                .route("account-route", r -> r
                        .path("/jspaccountservice/**")
                        .filters(f -> f.rewritePath("/jspaccountservice/(?<segment>.*)", "/${segment}"))
                        .uri("lb://jspaccountservice"))
                .route("booking-route", r -> r
                        .path("/jspbooking/**")
                        .filters(f -> f.rewritePath("/jspbooking/(?<segment>.*)", "/${segment}"))
                        .uri("lb://jspbooking"))
                .route("notification-route", r -> r
                        .path("/jspnotification/**")
                        .filters(f -> f.rewritePath("/jspnotification/(?<segment>.*)", "/${segment}"))
                        .uri("lb://jspnotification"))
                .build();
    }*/
}
