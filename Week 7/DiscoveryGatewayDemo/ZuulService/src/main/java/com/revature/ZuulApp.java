package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.revature.filters.SimplePreFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApp.class, args);

	}
	
	@Bean
	public SimplePreFilter simplePreFilter() {
		return new SimplePreFilter();
	}

}
