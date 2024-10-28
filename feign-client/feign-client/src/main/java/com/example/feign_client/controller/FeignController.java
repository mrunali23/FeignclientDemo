package com.example.feign_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign_client.entity.UserDTO;
import com.example.feign_client.service.FeignService;

@RestController
public class FeignController {
	 private final FeignService feignService;

	    @Autowired
	    public FeignController(FeignService feignService) {
	        this.feignService = feignService;
	    }

	    @GetMapping("/feign/users/{id}")
	    public UserDTO getUser(@PathVariable Long id) {
	    	System.out.println("I am in feign client controller");
	        return feignService.getUserById(id);
	    }
}
