package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;
import java.util.List;

/**
 * Aayush Acharya
 * @author Aayush Acharya
 * {@summary the implementation of Average Grade strategy}
 */
public class Driver {
	
	/**
	 * {@summary the main method to implement the Driver class}
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		AverageContext ctx = new AverageContext();
		
		ctx.setAverageStrategy(new AllAverageStrategy());
		
		List<Integer> grades = new ArrayList<Integer>();
//		add the grades value
		grades.add(98);
		grades.add(97);
		grades.add(93);
		grades.add(92);
		grades.add(95);
		grades.add(98);
		grades.add(100);
		
		try {
			System.out.println("For average of all grades provided");
			System.out.println("When the grades are: [98, 97, 93, 92, 95, 98, 100], the result is");
			System.out.println(ctx.calculateAverage(grades));
		} 
		catch (EmptyListException ex) {
			System.out.println("The list should not be empty");
		}
		
		System.out.println("__________________________________________________");
		
		List<Integer> grades1 = new ArrayList<Integer>();
		
		try {
			System.out.println("To showcase the error handling For average of all grades provided");
			System.out.println("When the grades are: [] the result is");
			System.out.println(ctx.calculateAverage(grades1));
		} 
		catch (EmptyListException ex) {
			System.out.println("The list should not be empty");
		}
		
		System.out.println("__________________________________________________");
		
		ctx.setAverageStrategy(new DroppedAverageStrategy());
		
		try {
			System.out.println("For average of all grades after dropping two lowest grades is");
			System.out.println("When the grades are: [98, 97, 93, 92, 95, 98, 100], the result is");
			System.out.println(ctx.calculateAverage(grades));
		} 
		catch (EmptyListException ex) {
			System.out.println("The list should not be empty");
		}
		
		System.out.println("__________________________________________________");
		
		try {
			System.out.println("To showcase error handling for average of all grades after dropping two lowest grades is");
			System.out.println("When the grades are: [], the result is");
			System.out.println(ctx.calculateAverage(grades1));
		} 
		catch (EmptyListException ex) {
			System.out.println("The list should not be empty or have length less than or equal to 2");
		}
		

	}
}
