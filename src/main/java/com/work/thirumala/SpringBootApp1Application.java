package com.work.thirumala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApp1Application {
	private Map<String,Object> cache = new HashMap<String,Object>();

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp1Application.class, args);
		//changes for HIS-134
		int a = 10;
		context.close();
	}
	
	public void loadToCache(){
		//logic
	}

}
