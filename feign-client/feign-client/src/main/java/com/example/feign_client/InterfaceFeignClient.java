package com.example.feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.feign_client.config.FeignConfig;
import com.example.feign_client.entity.UserDTO;

@FeignClient(name = "userservice", url = "http://localhost:8080")//, configuration = FeignConfig.class)
public interface InterfaceFeignClient {

	 @GetMapping(value="/users/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	    UserDTO getUserById(@PathVariable("id") Long id);
	 
	 @GetMapping("/welcome")
	 String getString();
}
