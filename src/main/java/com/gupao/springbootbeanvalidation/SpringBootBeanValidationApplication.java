package com.gupao.springbootbeanvalidation;

import com.gupao.web.controller.UserControllerInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(value = "com.gupao.web.controller")
public class SpringBootBeanValidationApplication implements WebMvcConfigurer {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeanValidationApplication.class, args);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(  new UserControllerInterceptor() );
	}


}
