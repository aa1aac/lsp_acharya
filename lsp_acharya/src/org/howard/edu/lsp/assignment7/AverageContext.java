package org.howard.edu.lsp.assignment7;

import java.util.List;
/**
 * {@summary Class implementation for the Average Context}
 * Aayush Acharya
 * @author Aayush Acharya
 *
 */
public class AverageContext {
	private AverageStrategy strategy;
	
	/**
	 * {@summary method to set the strategy of the context}
	 * @param strategy AverageStrategy either takes in AllAverageStrategy or DroppedAverageStrategy
	 * @return void
	 */
	public void setAverageStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * {@summary a method that calculates the average of the grades}
	 * @param grades list of integers that has the grades of the students
	 * @return integer average value of the grade
	 * @throws EmptyListException if the list is empty
	 */
	int calculateAverage(List<Integer> grades) throws EmptyListException {
		try {
			int average = strategy.compute(grades);
			return average;
		}
		catch(EmptyListException e) {
			throw new EmptyListException();
		}
		
	}
	/**
	 * {@summary method to return the type of the strategy}
	 * @return type of strategy
	 */
	public Object getStrategyType () {
		return this.strategy.getClass();
	}
}
