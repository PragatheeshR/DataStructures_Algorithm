package com.praga.datastructures;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-4, 8, 9, 4, 89, 65};
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			//temp = 0;
			if(arr[i] > max1) {
				temp = max1;
				max1 = arr[i];
			}
			if(temp > max2) {
				max2 = temp;
				temp = max2;
				
			}
			if(temp > max3) {
				max3 = temp;
				temp = max3;
				
			}
		}
		
		System.out.println(max1+","+max2+","+max3);

	}

}
