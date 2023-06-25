package com.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
	public static void main(String[] args) {
		
		Recursion rc= new Recursion();
		//rc.printNames("Pragatheesh", 5);
		//rc.printNumbers(10);
		//System.out.println(rc.summation(5));
		int arr[] = {1,2,3};
//		arr = rc.reverseArray(arr, 0, arr.length - 1);
//		System.out.println(Arrays.toString(arr));
		
		//System.out.println(rc.isPalindrome("amnma", 0, 4));
		rc.subSeq(arr, 0, new ArrayList<>());
		
	}
	
	
	public void printNames(String name, int count) {
		
		if(count == 0) {
			return;
		}
		System.out.println(name);
		printNames(name, count - 1);
	}
	
	private void printNumbers(int n) {
		if(n == 0)
			return;
		printNumbers(n - 1);
		System.out.println(n);
		
	}
	
	private int summation(int n) {
		
		if(n == 1) {
			return 1;
		}
		return n + summation(n - 1);
	}
	
	private int[] reverseArray(int[] arr, int i, int j) {
		
		if(i >= j) {
			return arr;
		}
		
		arr[i] = arr[j] + arr[i];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
		
		return reverseArray(arr, i+1, j-1);
	}
	
	private boolean isPalindrome(String value, int i, int j) {
		
		if(i >= j) {
			return true;
		}
		
		if(value.charAt(i) == value.charAt(j)) {
			return isPalindrome(value, i+1, j-1);
		}
		return false;
	}
	
	private void subSeq(int arr[], int idx, List<Integer> list) {
		
		if(idx >= arr.length) {
			System.out.println(list);
			return;
		}
		
		list.add(arr[idx]);
		subSeq(arr, idx+1, list);
		list.remove(list.size() - 1);
		subSeq(arr, idx+1, list);
		
	}

}
