package org.howard.edu.lsp.assignment7;

/**
 * Aayush Acharya
 * {@summary Class implementation for the exception of empty list}
 * @author Aayush Acharya
 *
 */
public class EmptyListException extends Exception {
	
	/**
	 * @return void
	 * {@summary constructor to display the error message}
	 */
	public EmptyListException() {
//		print out the exception message
		super("The list cannot be empty");
	}
}
