package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;

/**
 * Aayush Acharya
 * {@summary Class implementation for the Dropped average value}
 * @author Aayush Acharya
 *
 */
public class DroppedAverageStrategy implements AverageStrategy {
	
	/**
	 * {@summary method to compute the average by dropping two lowest grade}
	 * @param grades list of integers 
	 * @return integer average of the grades after dropping two lowest grade
	 * @throws EmptyListException if the size of list is less than or equal to 2
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException{
		
		if (grades.size() <= 2) {
			throw new EmptyListException();
		}
		
		Collections.sort(grades, Collections.reverseOrder());
		
		grades.remove(grades.size() - 1);
		grades.remove(grades.size() - 1);
		
		Integer total = 0;
		
		for(int i = 0; i < grades.size(); i++) {
			total += grades.get(i);
		}
		
		Integer average =  Math.round( (float) total / (float) grades.size());
		return average;
	}

}
