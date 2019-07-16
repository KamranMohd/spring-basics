package com.learning.springboot.springbasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int [] numbers){
		//	Sorting algorithm here
		return numbers;
	}
}
