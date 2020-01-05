package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UnionProjectApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
System.out.println("UnionProjectApplication start~~!");
		SpringApplication.run(UnionProjectApplication.class, args);
	}

	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) { 
		return builder.sources(UnionProjectApplication.class); 
	}


}
