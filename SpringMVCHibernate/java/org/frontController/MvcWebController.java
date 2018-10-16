package org.frontController;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("org.controller")
public class MvcWebController extends WebMvcConfigurerAdapter{
	
	public MvcWebController(){
		System.out.println("Inside the MvcWebController");
	}

}
