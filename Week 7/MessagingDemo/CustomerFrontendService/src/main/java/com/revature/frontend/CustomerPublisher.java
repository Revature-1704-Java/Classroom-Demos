package com.revature.frontend;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

import com.revature.frontend.model.Customer;

@EnableBinding(CustomerSource.class)
public class CustomerPublisher {

		//@InboundChannelAdapter(channel=Source.OUTPUT)
		public String sendCustomer() {
			return "Charizard";
		}
		
		@Bean
		@InboundChannelAdapter(channel="customerChannel")
		public MessageSource<Customer> sendRealCustomer() {
			return () -> MessageBuilder.withPayload(new Customer(4, "Andropov", 3.13)).build();
		}
}
