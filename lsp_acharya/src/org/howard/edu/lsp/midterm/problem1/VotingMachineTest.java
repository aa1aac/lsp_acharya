package org.howard.edu.lsp.midterm.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.midterm.problem1.VotingMachine.UnknownCandidateException;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VotingMachineTest {
	VotingMachine votingMachine1;
	VotingMachine votingMachine2;

	/**
	 * {@summary a method that sets up the variables for each of the test cases}
	 * @throws Exception
	 * @return void
	 */
	@BeforeEach
	public void setUp() throws Exception {
		votingMachine1 = new VotingMachine();
		votingMachine2 = new VotingMachine();
	}

	/**
	 * {@summary a method that resets the variables for each of the test cases}
	 * @throws Exception
	 * @return void
	 */
	@AfterEach
	public void tearDown() throws Exception {
	}

	
	
	@Test
	@DisplayName("Test case for getVotes")
	public void testGetVotes() throws UnknownCandidateException {
		votingMachine1.addCandidate("john");
		votingMachine1.castVotes("john", 100);
		
		
		assertThrows("test when we ask to get votes for the candidate not in the votes ", UnknownCandidateException.class ,
				() -> {
					votingMachine1.getVotes("jon");
				}
				);
		
		assertEquals("test to find total votes of the votingMachine", votingMachine1.getVotes("john"), 100);
	}
	
	/**
	 * {@summary method to check the sum total of the votes}
	 */
	@Test
	@DisplayName("Test case for sum")
	public void testSum() {
		votingMachine1.addCandidate("clark");
		votingMachine1.addCandidate("john");
		votingMachine1.castVotes("clark", 100);
		votingMachine1.castVotes("john", 200);
		
		assertEquals("test to find out the total votes for voting Macnhine1", votingMachine1.sum(), 300);
		
		votingMachine2.addCandidate("frank");
		votingMachine2.addCandidate("james");
		votingMachine2.castVotes("frank", 100);
		votingMachine2.castVotes("james", 500);
		assertEquals("test to find out the total votes for voting Macnhine2", votingMachine2.sum(), 600);

		
	}

}
