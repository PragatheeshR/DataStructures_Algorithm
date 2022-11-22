package com.praga.datastructures;

public class LinkedList {
	
	static LinkedList lt;
	
	int value;
	LinkedList tail;
	
	// this method adds the data and points the previous address
	public LinkedList append(int val, LinkedList list) {
		 value = val;
		 
		 
		 return this;
	}
	
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		LinkedList temp = null;
		temp = list.append(2, temp);
		temp = list.append(89, temp);
		temp = list.append(200, temp);
		temp = list.append(897, temp);
		
		while(list.tail == null) {
			System.out.println(list.value);
		}
		
		
		

	}

}
