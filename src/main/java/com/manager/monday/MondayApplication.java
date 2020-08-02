package com.manager.monday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MondayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MondayApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String cioChallenge(){
		return  "CIO ORG owns IBM's internal IT strategy and provides the tools, computers, devices, and " +
				"infrastructure that IBMers use to do their jobs every day. \n We also own the more than 4,000" +
				" applications that keep IBM running, from supply chain and logistics, to sales and marketing and " +
				"finance systems.";
	}
}
