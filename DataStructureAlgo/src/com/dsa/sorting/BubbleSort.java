package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {9,89,635,457,2,2,125};
		//System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		//System.out.println(Arrays.toString(arr));

	}
	
	static public void  bubbleSort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length - 1; j++) {
				
				if(arr[j] > arr[j + 1]) {
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
