package com.praga.datastructures;

public class TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar1[] = {8,9,16,23,85};
		int ar2[] = {2,6,71,73,84};
		int op[] = new int[ar1.length + ar2.length];
		int k = 0;
		int j = 0;
		int i = 0;
//		for(; i < ar1.length;) {
//			for(; j < ar2.length; ) {
//				if(ar1[i] < ar2[j]) {
//					op[k++] = ar1[i];
//					i++;
//					break;
//				}
//				if(ar1[i] > ar2[j]) {
//					op[k++] = ar2[j];
//					j++;
//				}
//			}
//		}
		
		while(i < ar1.length && j < ar2.length) {
			if(ar1[i] <= ar2[j]) {
				//System.out.println(k + "-" +ar1[i]);
				op[k++] = ar1[i];
				i++;
			}
			else {
				op[k++] = ar2[j];
				j++;
			}
		}
		
		while(i < ar1.length) {
			op[k++] = ar1[i];
			i++;
		}
		
		for(int a : op) {
			System.out.println(a);
		}

	}

}
