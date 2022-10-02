package org.howard.edu.lsp.assignment4.implementation;
import java.util.Collections;
import java.util.HashSet;

/** 
 * Aayush Acharya
 * @author Aayush
 * **/

/**
 * {@summary Responsible for the implementation of the set operation for the IntegerSet}
 * Class IntegerSet
 */
public class IntegerSet {
	private HashSet<Integer> set = new HashSet<Integer>();
	
	/**
	 * {@summary constructor of the class IngeterSet}
	 * @param No parameters
	 * @return void
	 */
	public IntegerSet() {
	}
	
	/**
	 * {@summary Method to clear the elements in the set}
	 * @param No parameters
	 * @return void
	 */
	public void clear() {
		set.clear();
	};
	
	/**
	 * {@summary returns the size of the set}
	 * @param No parameters
	 * @return size of the set
	 */
	public int length() {
		return set.size();
	};

	
	/**
	 * {@summary method to check whether the set b is equal to the set or not}
	 * @param b
	 * @return true if the set b i equal to the set
	 */
	public boolean equals(IntegerSet b) {
		return set.equals(b.set);
	}; 

	/**
	 * {@summary method to check whether the value is present in the set or not}
	 * @param value
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};
	
	/**
	 * Class for the integer set exception handling
	 * @author Aayush
	 */
	public class IntegerSetException extends Exception{
		/**
		 * {@summary constructor to create the integer set exception}
		 * @param No parameters
		 * 
		 */
		public IntegerSetException() {
			super("The set is empty");
		}
	}

	/**
	 * {@summary the method returns the largest value}
	 * @return highest value in the set 
	 * @throws IntegerSetException if the set is empty
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException  {
		int size = length();
		if (size==0) {
			throw(new IntegerSetException());
		}
		
		int highest = Collections.max(set);
		return highest;
	}; 

	/**
	 * {@summary the method to return the smallest value in the set}
	 * @return smallest value in the set
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException {
		
		if (length() == 0) {
			throw new IntegerSetException();
		}
		
		int lowest = Collections.min(set);
		return lowest;
		
	}

	/**
	 * {@summary the method to add the element to the set}
	 * @param item: the item to be added to the set
	 * @return void
	 */
	 public void add(int item) {
		 set.add(item);
	 }; 

	/**
	 * {@summary the method to remove the item from the set}
	 * @param item
	 * @return void
	 */
	public void remove(int item) {
		set.remove(item);
	}; 

	/**
	 * {@summary the method to find out the union of the set}
	 * @param intSetb
	 * @return void
	 */
	public void union(IntegerSet intSetb) {
		set.addAll(intSetb.set);
	};

	/**
	 * {@summary the method to find out the intersection of the set}
	 * @param intSetb
	 * @return void
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}; 

	/**
	 * {@summary the method to find out the difference of the set}
	 * @param intSetb
	 * @return void
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}

	/**
	 * {@summary method checks whether the set is empty}
	 * @param No parameters
	 * @return true if the set is empty, else false
	 */
	public boolean isEmpty() {
		return length() == 0;	
	}

	/**
	 * {@summary method to return the string representation of the set}
	 * @param no parameter
	 * @return void
	 */
	public String toString() {
		return set.toString();
	};
}
