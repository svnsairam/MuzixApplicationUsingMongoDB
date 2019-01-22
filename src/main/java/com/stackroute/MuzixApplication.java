package com.stackroute;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MuzixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApplication.class, args);
	}
	@Bean
	ServletRegistrationBean h2servletRegistration(){
		ServletRegistrationBean servletRegistrationBean =  new ServletRegistrationBean(new WebServlet());
		servletRegistrationBean.addUrlMappings("/console/*");
		return servletRegistrationBean;
	}
}

