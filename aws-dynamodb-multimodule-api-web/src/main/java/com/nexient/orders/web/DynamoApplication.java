package com.nexient.orders.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.log.LogDelegateFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication(scanBasePackages = {"com.nexient.orders"})
public class DynamoApplication {

	//private static final Logger logger = LogManager.getLogger(DynamoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DynamoApplication.class, args);

		//logger.info("Info level log message");
		//logger.warn("Warn level log message");
		//logger.debug("Debug level log message");
		//logger.trace("Warn level log message");
	}

}
