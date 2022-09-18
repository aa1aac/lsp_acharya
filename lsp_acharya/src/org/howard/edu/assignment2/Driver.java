package org.howard.edu.assignment2;

/** 
 * Aayush Acharya
 * @author Aayush
 * **/

/**
 * Class responsible for running the Combinations
 * 
 */
public class Driver {
	public static void main(String[] args) {
		Combinations comb = new Combinations();
		comb.compute(new int[]{5,5,15,10}, 15);
		System.out.println("___________________");  // to separate out the output
		comb.compute(new int[]{1,2,3,4,5,6}, 6);
		System.out.println("___________________");  // to separate out the output
		comb.compute(new int[] {} , 6);
		System.out.println("___________________");  // to separate out the output
		comb.compute(new int[] {1,2,3,4,5} , 15);
		System.out.println("___________________");  // to separate out the output
		comb.compute(new int[] {} , 15);
		System.out.println("___________________");  // to separate out the output
		comb.compute(new int[] {2,3,6,7, 1}, 7);
		System.out.println("___________________");  // to separate out the output

	}

}
