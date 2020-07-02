package com.project.tissue.sort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public final class BubbleSortAlgorithmShould {

    BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    @Test
    public void sortTestWithNumberPresent() {

        List<Integer> unsortedNumbers = Arrays.asList(3, 2, 9, 8, 5, 1, 6);

        List<Integer> result = bubbleSortAlgorithm.sort(unsortedNumbers);

        assertEquals(Arrays.asList(1, 2, 3, 5, 6, 8, 9), result);
    }

    @Test
    public void sortTestWithNoNumberPresent() {

        List<Integer> unsortedNumbers = Arrays.asList();

        List<Integer> result = bubbleSortAlgorithm.sort(unsortedNumbers);

        assertEquals(Arrays.asList(), result);
    }
}
