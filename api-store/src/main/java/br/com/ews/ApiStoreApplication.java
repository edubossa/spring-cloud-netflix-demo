package br.com.ews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiStoreApplication.class, args);
	}
}
