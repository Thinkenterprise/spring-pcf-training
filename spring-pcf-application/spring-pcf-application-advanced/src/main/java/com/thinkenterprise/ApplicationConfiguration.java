package com.thinkenterprise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.thinkenterprise.service.CloudEnvironmentService;
import com.thinkenterprise.service.DevelopmentEnvironmentService;
import com.thinkenterprise.service.EnvironmentService;


@Configuration
public class ApplicationConfiguration {

	@Bean
	@Profile("development")
	public EnvironmentService getDefaultEnvironmentService() {
		
		return new DevelopmentEnvironmentService();
		
	}
	
	@Bean
	@Profile("cloud")
	public EnvironmentService getCloudEnvironmentService() {
		
		return new CloudEnvironmentService();
		
	}
	

}
