package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import org.springframework.web.client.RestTemplate;

import com.swagger.client.codegen.rest.invoker.ApiClient;
@Configuration
public class MyConfig {
	
	@Value("${product.profiles.host.dkurl}")
	private String myBaseUri;
		//client side rest calling
		@Bean
		
		public RestTemplate getRestTemplate() {
			return new RestTemplate();
		}
		@Bean
		public ApiClient apiClient() {
			return new ApiClient().setBasePath(myBaseUri);
		}
	}

