package com.example.feign_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

@Configuration
public class FeignConfig {
	  @Bean
	    public RequestInterceptor requestInterceptor() {
	        return requestTemplate -> requestTemplate.header("Accept", "application/json");
	    }
}
