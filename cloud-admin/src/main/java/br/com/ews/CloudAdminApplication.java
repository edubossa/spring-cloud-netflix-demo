package br.com.ews;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * http://codecentric.github.io/spring-boot-admin/1.4.6/
 * <p></p>
 * https://github.com/joshiste/spring-boot-admin-samples
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class CloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAdminApplication.class, args);
	}
}
