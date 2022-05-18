package com.nss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate rt = new RestTemplate();
		return rt;
	}
	
}
