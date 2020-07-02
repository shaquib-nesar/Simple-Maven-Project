package com.project.tissue.sort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public final class DefaultSortShould {

    DefaultSort defaultSort = new DefaultSort();

    @Test
    public void sortTestWithNumberPresent() {

        List<Integer> unsortedNumbers = Arrays.asList(3, 2, 9, 8, 5, 1, 6);

        List<Integer> result = defaultSort.sort(unsortedNumbers);

        assertEquals(Arrays.asList(1, 2, 3, 5, 6, 8, 9), result);
    }

    @Test
    public void sortTestWithNoNumberPresent() {

        List<Integer> unsortedNumbers = Arrays.asList();

        List<Integer> result = defaultSort.sort(unsortedNumbers);

        assertEquals(Arrays.asList(), result);
    }

}
