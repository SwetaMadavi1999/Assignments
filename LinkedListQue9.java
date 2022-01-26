// Write a Java program to insert some elements at the specified position into a linked list.

package LinkedList;

import java.util.*;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>element01 = new LinkedList<String>();
		element01.add("Sweta");
		element01.add("Divya");
		element01.add("Tejaswini");

		System.out.println("Original liked list: \n"+element01);
		LinkedList<String> element02 = new LinkedList<String>();
		
		element02.add("Kajal");
		element02.add("Samiksha");
		System.out.println("After adding elements in specific position: ");
		element01.addAll(2,element02);
		System.out.println(element01);
	}

}

/* Output:
Original liked list: 
[Sweta, Divya, Tejaswini]
After adding elements in specific position: 
[Sweta, Divya, Kajal, Samiksha, Tejaswini]
*/
