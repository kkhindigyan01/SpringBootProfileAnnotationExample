package com.kkhindigyan.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	
	@Value(value = "${my.prop}")
	private String myProp;
	
	@Profile(value = { "default" })
	@Bean(name = "myProp")
	public String createBeanForDefault() {
		return myProp;
	}
	
	@Profile(value = { "dev" })
	@Bean(name = "myProp")
	public String createBeanForDev() {
		return myProp;
	}
	
	@Profile(value = { "prod" })
	@Bean(name = "myProp")
	public String createBeanForProd() {
		return myProp;
	}
}
