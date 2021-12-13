package com.example.lti;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestClientException;

import com.example.lti.controller.ConsumerControllerClients;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				ConsumerApplication.class, args);
		
		ConsumerControllerClients consumerControllerClient=ctx.getBean(ConsumerControllerClients.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getCustomer();
		
	}
	
/*	@Bean
	public  ConsumerControllerClients  consumerControllerClient()
	{
		return  new ConsumerControllerClients();
	}*/
}
