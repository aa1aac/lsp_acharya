package org.howard.edu.lsp.midterm.problem2;

/**
 * 
 * @author Aayush Acharya
 *
 */
public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;
		
	/**
	 * {@summary a constructor for the Person class}
	 * @param name String that takes in the name of the person
	 * @param socialSecurityNumber string that takes in the SSN
	 * @param age int that takes in the age of the person
	 */
		public Person(String name,  String socialSecurityNumber, int age) {
			// initialize private variables
			this.name = name;
			this.age = age;
			this.socialSecurityNumber = socialSecurityNumber;
		}
		
		/**
		 * {@summary a constructor that only takes in social security number and name}
		 * @param name String that takes in the name of the person
		 * @param socialSecurityNumber
		 */
		public Person(String name,  String socialSecurityNumber) {
			// initialize private variables
			this.name = name;
			this.socialSecurityNumber = socialSecurityNumber;
		}
		
		/**
		 * {@summary a method to override toString method}
		 */
		@Override
		public String toString() {
			return "name: " + this.name + " age: " + this.age + " SSN: " + this.socialSecurityNumber;
		}
		
		/**
		 * @param o Object that is to be checked
		 * {@summary a method to compare the equality of the objects}
		 */
		@Override
	    public boolean equals(Object o) {
	 
	        if (o == this) {
	            return true;
	        }
	 
	      
	        if (!(o instanceof Person)) {
	            return false;
	        }
	         
	        Person p = (Person) o;
	         
	        return p.socialSecurityNumber.equals(this.socialSecurityNumber);
	    }
	}

