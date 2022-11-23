package org.howard.edu.lsp.assignment7;

import java.util.List;

/**
 * Aayush Acharya
 * {@summary an interface for the Average Strategy}
 * @author Aayush Acharya
 *
 */
public interface AverageStrategy {
	/**
	 * {@summary method to calculate the average }
	 * @param grades list of integers that takes in grades
	 * @return Integer average grade.
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
}
