package com.project.tissue;

import java.util.LinkedList;
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

        List<Integer> numberList = new LinkedList<Integer>();
        numberList.add(5);
        numberList.add(7);
        numberList.add(22);
        numberList.add(1);
        numberList.add(55);
        numberList.add(6);

        int result = binarySearch.binarySearch(numberList, 22);
        System.out.println("Number found at index: " + result);

    }
}
