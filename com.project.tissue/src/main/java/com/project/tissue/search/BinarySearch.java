package com.project.tissue.search;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    public final int search(final List<Integer> sortedNumbers, final int key) {

        int low = 0;
        int high = sortedNumbers.size();
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedNumbers.get(mid) < key) {
                low = mid + 1;
            } else if (sortedNumbers.get(mid) > key) {
                high = mid - 1;
            } else if (sortedNumbers.get(mid) == key) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
