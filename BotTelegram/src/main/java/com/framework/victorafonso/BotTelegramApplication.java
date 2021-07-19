package com.framework.victorafonso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.framework.victorafonso.*")
public class BotTelegramApplication {

	public static void main(String[] args) {
		SpringApplication.run(BotTelegramApplication.class, args);
	}

}
