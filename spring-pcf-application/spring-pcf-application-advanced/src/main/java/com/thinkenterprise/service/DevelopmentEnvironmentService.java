package com.thinkenterprise.service;


public class DevelopmentEnvironmentService implements EnvironmentService{

	private String environmentString = "Running in Default Environment";
	
	@Override
	public String getEnvironment() {
		
		return environmentString;
		
	}

}
