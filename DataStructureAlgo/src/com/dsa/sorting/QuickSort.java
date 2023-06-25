package com.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {9,89,635,125,125,457,2,2,125,125};
		quickSorter(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}
	
	static void quickSorter(int[] arr, int low, int high) {
		
		if(low >= high) {
			return;
		}
		
		int pivot = partition(arr,low,high);
		
		quickSorter(arr, low, pivot - 1);
		quickSorter(arr, pivot + 1, high);
	}

	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		
		int i = low;
		int j = high - 1;
		
		while(i <= j) {
			
			while( i <= j && arr[i] <= pivot) {
				i++;
			}
			while(j >= i && arr[j] > pivot) {
				j--;
			}
			
			if(i < j) {
				arr[i] = arr[i] + arr[j];
				arr[j] = arr[i] - arr[j];
				arr[i] = arr[i] - arr[j];
				i++;
				j--;
			}
		}
		if(arr[i] > arr[high]) {
			arr[i] = arr[i] + arr[high];
			arr[high] = arr[i] - arr[high];
			arr[i] = arr[i] - arr[high];
		}
		
		return i;
	}

}
