package com.example.configprops;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Component
	class Runner implements CommandLineRunner {

		private final MyProperties myProperties;

		Runner(MyProperties myProperties) {
			this.myProperties = myProperties;
		}

		@Override
		public void run(String... args) throws Exception {
			myProperties.getAllowedDomains().forEach(System.out::println);
		}
	}

}
