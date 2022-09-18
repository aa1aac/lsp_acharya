package org.howard.edu.assignment2;

import java.util.ArrayList;
import java.util.Arrays;

/** 
 * Aayush Acharya
 * @author Aayush
 * **/


/**
 * Class Combinations responsible for calculation of combinations
 */
public class Combinations {
	/**
	 * Takes input and sum from to calculate the combinations
	 * and prints out the result
	 * @param input The values to combine, sum the total value required
	 * @return void
	 */
	public void compute(int[] input, int sum) {
//		stores answer
		ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
//		has temporary values 
		ArrayList<Integer> temp = new ArrayList<Integer>();
		calculateCombination(answer, input, temp, sum, 0);
		
		if (answer.size() == 0) {
			System.out.println(Arrays.deepToString(answer.toArray()));
		}
//		Print out the answer
		for(int i = 0; i < answer.size(); i++) {
			System.out.println(answer.toArray()[i].toString());
		}
		
	}
	
	/**
	 * A helper function to recurse over the array and find out the combinations 
	 * and store it in answer ArrayList
	 * @param answer stores the answer as ArrayList, input provides the input array,
	 * temp stores the temporary array 
	 * curr_target stores the current target value
	 * start provides the starting index for the recursive call
	 * @return void
	 */
	private void calculateCombination(ArrayList<ArrayList<Integer>> answer, 
			int input[], 
			ArrayList<Integer> temp, 
			int curr_target, 
			int start) {
		
//		check if curr_target is less than 0
		if (curr_target < 0) {
			return;
		}
		
//		add the value to the answer if curr_target == 0
		if (curr_target == 0) {
			answer.add(new ArrayList<Integer>(temp));
			return;
		}
		
		
		for (int i = start; i < input.length; i ++) {
			
			temp.add(i);
			
//			recurse through the input
			calculateCombination(answer, input, temp, curr_target - input[i] ,i + 1);
			
			temp.remove(temp.size() - 1);
		}
		
	}
}
