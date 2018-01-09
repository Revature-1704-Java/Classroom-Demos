package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.PersonService;

public class App {

	static PersonService personService;

	public static void main(String[] args) {

		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		personService = ac.getBean("personService", PersonService.class);
		System.out.println(personService.getMe().getName());

	}
	
	public static void setPersonService(PersonService ps) {
		personService = ps;
	}

}
