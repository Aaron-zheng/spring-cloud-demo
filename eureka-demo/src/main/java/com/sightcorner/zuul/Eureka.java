package com.sightcorner.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class Eureka {

	public static void main(String[] args) {
        new SpringApplicationBuilder(Eureka.class).web(true).run(args);
//		SpringApplication.run(ZuulDemoApplication.class, args);
	}
}
