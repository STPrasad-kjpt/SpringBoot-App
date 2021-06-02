package com.work.thirumala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp1Application {
	private static final String REST_URL = "https://www.equifax.com/getScores";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp1Application.class, args);
		//changes for HIS-134
		int a = 10;
		context.close();
	}

}
