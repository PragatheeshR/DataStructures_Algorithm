package com.praga.datastructures;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 16;
		String arr[] = new String[16];
		int j = 0;
		for(int i = 1; i <= n; i++) {
			boolean isFive = i % 5 == 0;
			boolean isThree = i % 3 == 0;
			if(isThree && isFive) {
				arr[j++] = "FizzBuzz";
			}
			else if(isThree) {
				arr[j++] = "Fizz";
			}
			
			else if(isFive) {
				arr[j++] = "Buzz";
			}
			else {
				arr[j++] = new Integer(i).toString();
			}
		}
		
		for(String var : arr) {
			System.out.print(var+",");
		}

	}

}
