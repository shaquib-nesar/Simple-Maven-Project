package com.project.tissue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		//LOGGER.info("Abi...");

		ApplicationContext applicationContext = SpringApplication.run(App.class, args);
		
		BinarySearchImplemetation binarySearch = 
				applicationContext.getBean(BinarySearchImplemetation.class);
		int result = binarySearch.binarySearch(new int[] { 1, 4, 2, 33, 5 }, 33);
		System.out.println(result);

		
	}
}

