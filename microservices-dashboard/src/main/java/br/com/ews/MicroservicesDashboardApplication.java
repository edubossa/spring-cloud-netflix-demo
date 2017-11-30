package br.com.ews;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * http://ordina-jworks.github.io/microservices-dashboard/1.0.1/
 *
 * https://github.com/ordina-jworks/microservices-dashboard
 */
@EnableDiscoveryClient
@EnableMicroservicesDashboardServer
@SpringBootApplication
public class MicroservicesDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDashboardApplication.class, args);
	}
}
