package com.praga.datastructures;

import java.util.ArrayList;
import java.util.List;

public class SubSequencePowerSet {

	public static void main(String[] args) {
		
		System.out.println(new SubSequencePowerSet().subSequence("abc"));

	}
	
	public List<String> subSequence(String value){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < (1 << value.length()) - 1; i++) {
			String op = "";
			for(int j = 0; j < value.length(); j++) {
				if((i & (1 << j)) != 0){
					op += value.charAt(j);
				}
			}
			list.add(op);
		}
		
		return list;
		
	}

}
