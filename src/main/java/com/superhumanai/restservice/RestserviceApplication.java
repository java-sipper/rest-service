package com.superhumanai.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);
		OauthTokenService oauthTokenService=new OauthTokenService();
		oauthTokenService.getOauthToken();
		oauthTokenService.getOauthToken();
	}

}
