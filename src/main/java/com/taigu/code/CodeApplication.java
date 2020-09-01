package com.taigu.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author Administrator
 */
@SpringBootApplication
public class CodeApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CodeApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CodeApplication.class);
	}
}
