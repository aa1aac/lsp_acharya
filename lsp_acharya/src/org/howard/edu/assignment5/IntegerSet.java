package org.howard.edu.assignment5;

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
//	initialization of the hashset
	private HashSet<Integer> set = new HashSet<Integer>();
	
	/**
	 * {@summary constructor of the class IngeterSet}
	 * @return void
	 */
	public IntegerSet() {
	}
	
	/**
	 * {@summary Method to clear the elements in the set}
	 * @return void
	 */
	public void clear() {
//		clear the values in the set
		set.clear();
	};
	
	/**
	 * {@summary returns the size of the set}
	 * @return size of the set
	 */
	public int length() {
//		return the size of the set
		return set.size();
	};

	
	/**
	 * {@summary method to check whether the set b is equal to the set or not}
	 * @param b IntegerSet to be compared with
	 * @return true if the set b i equal to the set
	 */
	public boolean equals(IntegerSet b) {
//		check the equality of the set
		return set.equals(b.set);
	}; 

	/**
	 * {@summary method to check whether the value is present in the set or not}
	 * @param value integer value to be checked
	 * @return boolean true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
//		check whether value is present in the set or not
		return set.contains(value);
	};
	
	/**
	 * Class for the integer set exception handling
	 * @author Aayush
	 */
	public class IntegerSetException extends Exception{
		/**
		 * {@summary constructor to create the integer set exception}
		 * 
		 */
		public IntegerSetException() {
//			print out the exception message
			super("The set is empty");
		}
	}

	/**
	 * {@summary the method returns the largest value}
	 * @return highest Integer value in the set 
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException  {
		int size = length();
		if (size==0) {
			throw(new IntegerSetException());
		}
//		set highest to the maximum value in the set
		int highest = Collections.max(set);
		return highest;
	}; 

	/**
	 * {@summary the method to return the smallest value in the set}
	 * @return smallest value in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		
		if (length() == 0) {
			throw new IntegerSetException();
		}
//		set lowest to the minimum value
		int lowest = Collections.min(set);
		return lowest;
		
	}

	/**
	 * {@summary the method to add the element to the set}
	 * @param item Integer item to be added to the set
	 */
	 public void add(int item) {
//		 add item to the set
		 set.add(item);
	 }; 

	/**
	 * {@summary the method to remove the item from the set}
	 * @param item Integer item to be removed from the set
	 */
	public void remove(int item) {
//		remove item from the set
		set.remove(item);
	}; 

	/**
	 * {@summary the method to find out the union of the set}
	 * @param intSetb IntegerSet set to be unioned with
	 */
	public void union(IntegerSet intSetb) {
//		find the union of set a and set b
		set.addAll(intSetb.set);
	};

	/**
	 * {@summary the method to find out the intersection of the set}
	 * @param intSetb IntegerSet to be intersected
	 */
	public void intersect(IntegerSet intSetb) {
//		find the intersection of the set
		set.retainAll(intSetb.set);
	}; 

	/**
	 * {@summary the method to find out the difference of the set}
	 * @param intSetb IntegerSet to find out the difference.
	 */
	public void diff(IntegerSet intSetb) {
//		find out the difference of the set
		set.removeAll(intSetb.set);
	}

	/**
	 * {@summary method checks whether the set is empty}
	 * @return true if the set is empty, else false
	 */
	public boolean isEmpty() {
//		check if the set is empty or not
		return length() == 0;	
	}

	/**
	 * {@summary method to return the string representation of the set}
	 * @return string value of the set
	 */
	public String toString() {
//		change the set to the string
		return set.toString();
	};
	
	/**
	 * {@summary method to return the private set }
	 * @return value of the set
	 */
	
	public HashSet<Integer> getSet() {
		return set;
	}
}
