package bol.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * Main class.
 * 
 * @author Victor Afonso
 *
 */
@SpringBootApplication(scanBasePackages = "bol.com.*")
@EnableJpaRepositories
public class GenericCrudLibApplication {
	private static ConfigurableApplicationContext ctx;

	public static void main(String[] args) {
		ctx = SpringApplication.run(GenericCrudLibApplication.class, args);
	}

	public static void shutDown() {
		ctx.close();
	}
}
