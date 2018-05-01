package com.nitya.poc.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author tandels
 *
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
    	
    	//#### if you want to pass different property file..Help with multiple properties #####
    //	System.setProperty("spring.config.name", "test-override");
    	
        SpringApplication.run(Application.class, args);
    }
    
    
}
