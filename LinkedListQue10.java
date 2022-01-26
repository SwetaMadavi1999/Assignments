// Write a Java program to insert the specified element at the specified position in the linked list.

package LinkedList;

import java.util.*;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>element01 = new LinkedList<String>();
		element01.add("Sweta");
		element01.add("Divya");
		element01.add("Tejaswini");

		System.out.println("Original liked list: \n"+element01);
		element01.add(2,"Nandini");
		System.out.println("Element add into specific position: \n"+element01);
	}

}

/* Output:

Original liked list: 
[Sweta, Divya, Tejaswini]
Element add into specific position: 
[Sweta, Divya, Nandini, Tejaswini]
*/
