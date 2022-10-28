package org.howard.edu.lsp.midterm.problem2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {
	Person person1;
	Person person2;
	
	/**
	 * {@summary method to setup the person1 and person2}
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		person1 = new Person("name1", "111-11-1111", 5);
		person2 = new Person("name2", "111-11-1111", 10);
	}
	
	/**
	 * {@summary method for the tearDown}
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	/**
	 * {@summary method to check the sum total of the votes}
	 */
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		assertEquals("the test for person1 toString method", person1.toString(), "name: name1 age: 5 SSN: 111-11-1111");
		assertEquals("the test for person1 toString method", person2.toString(), "name: name2 age: 10 SSN: 111-11-1111");
	}

	/**
	 * {@summary method to check the sum total of the votes}
	 */
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		assertTrue("the test for person1 equals person2", person1.equals(person2));
		person1 = new Person("name1", "111-11-1111");
		person2 = new Person("name2", "111-11-1112");
		assertFalse("the test for person1 and person2", person1.equals(person2));
	}

}
