package com.nitya.poc.springboot.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="database")
public class DataBase {

	/** Bind below properties to java bean properties
	database.url=jdbc:postgresql:/localhost:5432/instance
	database.username=foo
	database.password=bar
	**/
	String url;
	String username;
	String password;
	
}
