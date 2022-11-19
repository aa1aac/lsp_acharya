package org.howard.edu.lsp.assignment7;

import java.util.List;

/**
 * Aayush Acharya
 * @author Aayush Acharya
 * {@summary Strategy Class that calculates the average}
 *
 */
public class AllAverageStrategy implements AverageStrategy {
	
	/**
	 * {@summary a method to compute the average of the grades}
	 * @param grades list of integer that has the grades 
	 * @throws EmptyListException when the list is empty
	 * @return Integer average value of the grades
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException{
		
		if (grades.size() == 0) {
			throw new EmptyListException();
		}
		
		int total = 0;
		for (int i = 0; i < grades.size(); i++) {
			total += grades.get(i);
		}
		
		int average = Math.round((float) total / (float) grades.size());
		
		return average;
	}

}
