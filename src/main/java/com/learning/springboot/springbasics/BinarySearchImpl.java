package com.learning.springboot.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgo;
	/*
	 * Constructor injection
	 */
	/*public BinarySearchImpl(SortAlgorithm sortAlgo) {
		this.sortAlgo = sortAlgo;
	}*/
	
	/*
	 * Setter injection. The application should run even in case
	 * 		this setter is not present explicitly
	 */
	public void setSortAlgo(SortAlgorithm sortAlgo) {
		this.sortAlgo = sortAlgo;
	}
	
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		// Sort the numbers array
		int sortedNumbers[] = sortAlgo.sort(numbers);
		for (int num : sortedNumbers)
			System.out.print(num + " ");
		System.out.println();
		// Search numberToSearch in the numbers[]
		return 1;
	}

}
