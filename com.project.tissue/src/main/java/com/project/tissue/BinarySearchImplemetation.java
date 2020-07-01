package com.project.tissue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.project.tissue.search.BinarySearch;
import com.project.tissue.sort.SortAlgorithm;

@Component
public class BinarySearchImplemetation {

    @Autowired
    @Qualifier("defaultSort")
    private SortAlgorithm sortAlgorithm;

    @Autowired
    private BinarySearch binarySearch;

    public final int binarySearch(final List<Integer> numbers,
            final int numberToSearch) {

        return binarySearch.search(sortAlgorithm.sort(numbers), numberToSearch);
    }
}
