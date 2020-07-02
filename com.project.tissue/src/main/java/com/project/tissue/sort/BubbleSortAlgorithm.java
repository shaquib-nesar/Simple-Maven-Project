package com.project.tissue.sort;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubbleSort")
public final class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public List<Integer> sort(final List<Integer> unsortedNumbers) {

        List<Integer> sortedNumbers = unsortedNumbers;
        int n = sortedNumbers.size();
        int temp;
        if (n > 1) {
            for (int x = 0; x < n; x++) {
                for (int i = 0; i < n - x - 1; i++) {
                    if (sortedNumbers.get(i).
                            compareTo(sortedNumbers.get(i + 1)) > 0) {
                        temp = sortedNumbers.get(i);
                        sortedNumbers.set(i, sortedNumbers.get(i + 1));
                        sortedNumbers.set(i + 1, temp);
                    }
                }
            }
        }
        return sortedNumbers;
    }

}
