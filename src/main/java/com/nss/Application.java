package com.nss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	private static final Map<String, Object> cache = new HashMap<String, Object>();
	private static final String REST_URL = "https://www.ashokit.com";


	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
	}

	public void loadCacheData(){
		// Logic 
	}

}
