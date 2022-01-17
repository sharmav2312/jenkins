package com.vishu.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExample {
	
	public static Logger logger  = LoggerFactory.getLogger(JenkinsExample.class);
	
	
	@PostConstruct
	public void init() {
		logger.info("Application started.....");
	}
	
	
	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(JenkinsExample.class, args);
	}

}
