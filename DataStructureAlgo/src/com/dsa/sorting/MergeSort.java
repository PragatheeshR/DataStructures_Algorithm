package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {9,89,635,125,125,457,2,2,125,125};
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}
	
	static public void mergeSort(int[] arr, int low, int high) {
		
		if(low == high) {
			return;
		}
		
		int mid = (high + low)/2;
		
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merger(arr, low, mid, high);
	}

	private static void merger(int[] arr, int low, int mid, int high) {
		
		List<Integer> list = new ArrayList<>();
		
		int l = low;
		int r = mid+1;
		
		while(r <= high && l <= mid) {
			if(arr[l] < arr[r]) {
				list.add(arr[l++]);
			}
			else {
				list.add(arr[r++]);
			}
		}
		
		while(r <= high) {
			list.add(arr[r++]);
		}
		
		while(l <= mid) {
			list.add(arr[l++]);
		}
		int idx = low;
		for(int a : list) {
			arr[idx++] = a;
		}
		
		
		
	}

}
