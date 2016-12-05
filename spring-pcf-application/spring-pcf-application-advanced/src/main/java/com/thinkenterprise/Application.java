/*
 * Copyright (C) 2016 Thinkenterprise
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * @author Rafael Kansy
 * @author Michael Schaefer
 */

package com.thinkenterprise;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkenterprise.service.EnvironmentService;

@RestController
@SpringBootApplication
public class Application {

	public static Log logger = LogFactory.getLog(Application.class);
	
	@Autowired
	private EnvironmentService environmentService;
	
	
	//@Value("${java.home}")
	//@Value("#{systemEnvironment['JAVA_HOME']}")
	//@Value("${m2.home}")
	//@Value("${my.m2.home}")
	
	@Autowired
	private Environment environemnt;
	
	//@Value("${spring.profiles.active}")
	//private String activeProfile;
	
	
	
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/helloWorld")
    public ResponseEntity<String> index() {
    	logger.info("Hello World");
    	   	
        return ResponseEntity.ok("Hello World");
    }
    
    
    @RequestMapping("/getProfile")
    public ResponseEntity<String[]>  getActiveProfile() {
    	
    	String[] profiles = environemnt.getActiveProfiles();
    	
    	return ResponseEntity.ok(profiles);
    }
    
    
    @RequestMapping("/getEnvironemt")
    public ResponseEntity<String>  getActiveEnvironment() {
    	
    	String environemntString = environemnt.toString();
    	
    	return ResponseEntity.ok(environemntString);
    }
    
    
    @RequestMapping("/getEnvironemtService")
    public ResponseEntity<String>  getEnvironmentService() {
    	
    	String environemntString = environemnt.toString();
    	
    	return ResponseEntity.ok(environmentService.getEnvironment());
    }
    
    
    
    
    
    
}
