package com.project.tissue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.project.tissue.sort.SortAlgorithm;

@Component
public class BinarySearchImplemetation {

	@Autowired
	@Qualifier("quickSort")
	SortAlgorithm sortAlgorithm;

//	
//    public BinarySearchImplemetation(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}


	public int binarySearch(int []numbers, int numberToSearch )
    {
		

//        Sort the array
        sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        
//        Search the arra'y
    	return numberToSearch;
    }
}
