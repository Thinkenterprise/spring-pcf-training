package com.thinkenterprise.service;

import org.springframework.beans.factory.annotation.Value;


public class CloudEnvironmentService implements EnvironmentService{

	
	private String environmentString = "Running in Cloud Environment";
	
	@Value("${vcap.application.name}")
	private String applicationName;
	
	
	@Override
	public String getEnvironment() {
		
		return applicationName + " "+ environmentString;
		
	}
	
}
