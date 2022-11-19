package org.howard.edu.lsp.assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * Aayush Acharya
 * @author Aayush Acharya
 * {@summary a class to implement test for the AverageContext}
 *
 */
class AverageContextTest {
	
	
	/**
	 * {@summary method that sets up each test}
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	/**
	 * {@summary method that sets up the ending of each test}
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	/**
	 * {@summary test method that checks whether the strategy is implemented or not}
	 */
	@Test
	@DisplayName("check if the strategy is properly implemented or not")
	public void testSetAverageStrategy() {
//		create new instance of  context
		AverageContext allAverage = new AverageContext();
		AverageContext droppedAverage = new AverageContext();
		
//		set two different strategies to the context
		allAverage.setAverageStrategy(new AllAverageStrategy());
		droppedAverage.setAverageStrategy(new DroppedAverageStrategy());
		
		
		assertEquals("test to check whether all average strategy is implemented or not", allAverage.getStrategyType(), AllAverageStrategy.class);

		assertEquals("test to check whether dropped average strategy is implemented or not", droppedAverage.getStrategyType(), DroppedAverageStrategy.class);

	}
	
	/**
	 * {@summary a method that tests the calculate average method}
	 * @throws EmptyListException when an empty list is provided to the compute method of the AverageContext
	 */
	@Test
	@DisplayName("Test case for calculating the average for different strategies")
	public void testCalculateAverage() throws EmptyListException {
		
		AverageContext allAverage = new AverageContext();
		AverageContext droppedAverage = new AverageContext();
		List<Integer> grades;
		List<Integer> grades1;
		
		allAverage.setAverageStrategy(new AllAverageStrategy());
		droppedAverage.setAverageStrategy(new DroppedAverageStrategy());
		grades = new ArrayList<Integer>();
		
		

		grades.add(98);
		grades.add(97);
		grades.add(93);
		grades.add(92);
		grades.add(95);
		grades.add(98);
		grades.add(100);
		
		grades1 = new ArrayList<Integer>();
		
		
		assertEquals("The average value of [98, 97, 93, 92, 95, 98, 100] is 96", 96, allAverage.calculateAverage(grades));
		
		assertThrows("when we find the average value of the grades: [], it should raise EmptyListException", EmptyListException.class ,
				() -> {
					
					allAverage.calculateAverage(grades1);
				}
				);
		
		assertEquals("The average value of [98, 97, 93, 92, 95, 98, 100] when dropped the grade is 98", droppedAverage.calculateAverage(grades), 98);
		
		assertThrows("when we find the average value after dropping of the grades: [], it should raise EmptyListException", EmptyListException.class ,
				() -> {
					droppedAverage.calculateAverage(grades1);
				}
				);
	}
	
	
	
	

}
