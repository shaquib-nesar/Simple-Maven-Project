package com.project.tissue;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(final String[] args) {

        ApplicationContext applicationContext =
                SpringApplication.run(App.class, args);

        BinarySearchImplemetation binarySearch =
                applicationContext.getBean(BinarySearchImplemetation.class);

        List<Integer> numberList = Arrays.asList(5, 7, 22, 1, 55, 6);

        int result = binarySearch.binarySearch(numberList, 22);
        LOGGER.info("Number found at index: " + result);

    }
}
