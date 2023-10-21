package com.tcsdemos.testBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestBootAppApplication {

	public static void main(String[] args) 
	{
		// here configurableApplicationcontext is reference of ioc container.
		ConfigurableApplicationContext cntxt =   SpringApplication.run(TestBootAppApplication.class, args);
		User user = cntxt.getBean(User.class);
		 System.out.println(user.hashCode());
	}
}
