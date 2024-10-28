package com.example.feign_client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.feign_client.InterfaceFeignClient;
import com.example.feign_client.entity.UserDTO;

@Service
public class FeignService {

	 private final InterfaceFeignClient userFeignClient;

	    @Autowired
	    public FeignService(InterfaceFeignClient userFeignClient) {
	        this.userFeignClient = userFeignClient;
	    }

	    public UserDTO getUserById(Long userId) {
	    	System.out.println("I am in feign client service");
	        return userFeignClient.getUserById(userId);
	    }
	    
	    public String getString() {
	    	return "welcome mrunali";
	    }
}
