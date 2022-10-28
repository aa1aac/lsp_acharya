package org.howard.edu.lsp.midterm.problem2;

/**
 * {@summary Driver class for the Person class}
 * @author Aayush Acharya
 *
 */
public class Driver  {
	/**
	 * {@summary main method to check the implementation of the Person class }
	 */
	public static void main(String[] args) {
		Person person1 = new Person("name1", "111-11-1111", 5);
		Person person2 = new Person("name2", "111-11-1111", 10);
		
		System.out.println("We have person person 1 with name: name1, age: 5, ssn: 111-11-1111");
		System.out.println("The person1.toString gives us : " + person1.toString());
		
		System.out.println("_____________________________________");
		
		System.out.println("We have person person2 with name: name2, age: 10, ssn: 111-11-1111");
		System.out.println("the output of person2.toString gives us: " + person2.toString());
		
		System.out.println("________________________________");
		
		System.out.println("We have person 1 and person 2 with same ssn 111-11-1111. So the result for .equals method looks like this:");
		
		System.out.println(person1.equals(person2));
		
		System.out.println("So our output should be:");
		if (person1.equals(person2)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}

		
		System.out.println("_____________________________________");
		
		person1 = new Person("name1", "111-11-1112");
		person2 = new Person("name2", "111-11-1111");
		
		System.out.println("We have person 1 with name: name1, ssn: 111-11-1112");
		System.out.println("We have person 2 with name: name2, ssn: 111-11-1111");
		System.out.println("Our result for the equals method looks like this");
		System.out.println(person1.equals(person2));
		System.out.println("So our output should be:");
		if (person1.equals(person2)) {
		    System.out.println("These are the same!");	// in this case, they would be the same
		} else {
		    System.out.println("Not the same!");
		}

		
		
	}

}
