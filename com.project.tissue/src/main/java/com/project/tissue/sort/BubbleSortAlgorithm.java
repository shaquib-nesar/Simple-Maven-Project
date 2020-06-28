package com.project.tissue.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubbleSort")
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] unsortedNumbers) {

		return unsortedNumbers;
	}
}
