package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class StreamIntakeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamIntakeServiceApplication.class, args);
	}
	
	@StreamListener(target=Sink.INPUT)
	public void log(String msg) {
		System.out.println(msg);
	}
}
