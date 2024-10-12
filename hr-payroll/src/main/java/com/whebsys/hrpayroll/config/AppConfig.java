package com.whebsys.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	// Singleton (Instancia única)
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}