package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Customer;

@RefreshScope
@RestController
public class CustomerController {
	
	private List<Customer> customers;
	
	public CustomerController() {
		customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Stalin", 12.56));
		customers.add(new Customer(2, "Lenin", 5.00));	
	}
	
	@GetMapping(value="/customer/{id}", produces="application/json")
	public Customer getCustomer(@PathVariable int id) {
		Customer returnCustomer = null;
		for (Customer c : customers) {
			if (id == c.getId()) {
				returnCustomer = c;
			}
		}
		return returnCustomer;
	}

}
