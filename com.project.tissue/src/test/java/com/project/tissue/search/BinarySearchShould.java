package com.project.tissue.search;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinarySearchShould {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void searchTestWithNumberPresentInList() {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int numbersToSearch = 3;
        
        int result = binarySearch.search(numbers, numbersToSearch);
        
        assertEquals(2, result);
    }

    @Test
    public void searchTestWithNumberNotPresentInList() {

        List<Integer> numbers = Arrays.asList(1,2,3,5,6,7);
        int numbersToSearch = 4;
        
        int result = binarySearch.search(numbers, numbersToSearch);

        assertEquals(-1, result);
    }
}
