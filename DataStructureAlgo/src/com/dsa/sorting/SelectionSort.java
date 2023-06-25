package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {9,89,635,457,2,2,125};
//		System.out.println(Arrays.toString(arr));
//		selectionSort(arr);
//		System.out.println(Arrays.toString(arr));
		
		System.out.println(getkSmallestNumbers(arr, 3));
	}
	
	public static void selectionSort(int[] arr) {
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("**********************");
		
	}
	
	public static List<Integer> getkSmallestNumbers(int[] arr, int k){
		List<Integer> list = new ArrayList<>();
		
for(int i = arr.length - 1; i > k; i--) {
			
			for(int j = i-1; j >= 0; j--) {
				
				if(arr[i] < arr[j]) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
			list.add(arr[i]);
			//System.out.println(Arrays.toString(arr));
		}
		//System.out.println("**********************");
		
		return list;
		
	}

}
