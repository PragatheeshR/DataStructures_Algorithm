package com.recursive;

import java.util.Arrays;
import java.util.Stack;

public class SubSeqofSum {

	public static void main(String[] args) {
		

	}
	
	public int[] nextGreaterElements(int[] nums) {

        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);

        Stack<Pair> stack = new Stack();

        for(int i = 0; i < nums.length; i++){

            while(!stack.isEmpty() && stack.peek().value < nums[i]){
                arr[stack.pop().index] = nums[i];
            }

            stack.push(new Pair(i, nums[i]));
        }
        stack.clear();

        for(int i = nums.length - 1; i >=0; i--){

            stack.push(new Pair(i, nums[i]));
        }

        


        return arr;

        
    }
class Pair{
    int index;
    int value;

    Pair(int index, int value){
        this.index = index;
        this.value = value;
    }
}

}
