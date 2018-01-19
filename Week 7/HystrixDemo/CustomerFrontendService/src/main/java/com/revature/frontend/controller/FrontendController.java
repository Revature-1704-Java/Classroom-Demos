package com.revature.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.revature.frontend.model.Customer;

@RestController
public class FrontendController {
	
	@Bean
	public RestTemplate restTemplate (RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getLeninInstead")
	@GetMapping("/getStalin")
	public String getStalin() {
		Customer c = restTemplate.getForObject("http://localhost:8988/customer/1", Customer.class);
		return c.getName();
	}
	
	public String getLeninInstead() {
		return "Lenin";
	}

}
