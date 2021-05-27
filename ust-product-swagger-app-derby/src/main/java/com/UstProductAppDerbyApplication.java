package com;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UstProductAppDerbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(UstProductAppDerbyApplication.class, args);
	}
	@Bean
	public Docket swaggerConfiguration() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				//.paths(PathSelectors.ant("/product/*"))
				.apis(RequestHandlerSelectors.basePackage("com.ust.pms.controller"))
				.build().apiInfo(getApiInfo());
	}
	private ApiInfo getApiInfo() {
		return new ApiInfo("Product App Info","CRUD operation on product","1.0","licence",
				new Contact("Dhananjay ","http://www.dhantehnoworld.com","dhananjoykr000@gmail.com"),
				"API Licence","www.dhantehnoworld.com",Collections.emptyList());

	}

}
