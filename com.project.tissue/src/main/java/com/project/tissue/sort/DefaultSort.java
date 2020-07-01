package com.project.tissue.sort;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("defaultSort")
public final class DefaultSort implements SortAlgorithm {

    @Override
    public List<Integer> sort(final List<Integer> unsortedNumbers) {

        List<Integer> sortedNumbers = unsortedNumbers;
        Collections.sort(sortedNumbers);
        return unsortedNumbers;
    }

}
