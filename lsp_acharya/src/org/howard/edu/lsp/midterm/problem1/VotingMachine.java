package org.howard.edu.lsp.midterm.problem1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet.IntegerSetException;

/**
 * 
 * @author Aayush Acharya
 *
 */
public class VotingMachine {
		// YOU must decide upon an appropriate data representation to associate a name with respective votes.  Create whatever you like.
		private Map<String, Integer> votes = new HashMap<String, Integer>();
		
		/**
		 * {@summary a function to add the candidate to the votes}
		 * @param name string that takes in the name of the candidate
		 */
		public void addCandidate(String name) {
			// Add a candidate to the list, initialize number of votes to 0
			votes.put(name, 0);
		} 
		
		/**
		 * {@summary the method to cast votes of the candidate}
		 * @param name String that takes in name of the candidate
		 * @param votes Integer that takes in the total votes of the candidate
		 */
		public void castVotes(String name, int votes) {
			// Cast votes to the candidate with the given name
			int voteCount = this.votes.get(name);
			voteCount = voteCount + votes;
			this.votes.put(name, voteCount);
		}
		
		/**
		 * {@summary a class that implements Unknown CandiadateException}
		 * @author Aayush Acharya
		 *
		 */
		public class UnknownCandidateException extends Exception{
			/**
			 * {@summary constructor to create the unknown candidate exception}
			 * 
			 */
			public UnknownCandidateException() {
//				print out the exception message
				super("The candidate is not present");
			}
		}
		
		/**
		 * {@summary the returns the votes from the getVotes}
		 * @return integer value form the given names
		 * @throws UnknownCandidateException if the name doesn't exist
		 * @param names String names of the candidates
		 */
		public int getVotes(String name)  throws UnknownCandidateException {
			// Return the number of votes for a given candidate.  Throws
			// UnknownCandidateException if name not present.  Make this a 
			// checked exception.
			
			if (votes.containsKey(name)) {
				return votes.get(name);
			}
			else {
				throw (new UnknownCandidateException());
			}
			
					}

		/**
		 * {@summary a method to return the sum of the total votes casted}
		 * @return total integer value of the total votes casted
		 */
		public int sum() {
			// Return the total number of votes for all candidates.	
			int total = 0;
			
			Object[] names = votes.keySet().toArray();
			
			for (int i = 0; i < names.length; i++) {
				total = total + votes.get(names[i]);
			}
			
			return total;
		}

}
