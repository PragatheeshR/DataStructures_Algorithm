package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {9,89,635,457,2,2,125};
		insertionSort(arr);
		//System.out.println(Arrays.toString(arr));

	}
	
	public static void insertionSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int j = i+1; j > 0; j--) {
				
				if(arr[j] < arr[j-1]) {
					arr[j] = arr[j] ^ arr[j-1];
					arr[j - 1] = arr[j] ^ arr[j-1];
					arr[j] = arr[j] ^ arr[j-1];
				}
				else {
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
