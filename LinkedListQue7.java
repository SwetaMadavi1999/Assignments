//Write a Java program to insert the specific element at the front of a linked list.

package LinkedList;

import java.util.LinkedList;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>element01 = new LinkedList<String>();
		element01.add("Sweta");
		element01.add("Divya");
		element01.add("Tejaswini");
		element01.add("Riddhi");

		System.out.println("Original liked list: \n"+element01);
		element01.addFirst("Kajal");
		System.out.println("After adding element at the front of the linked list:\n"+element01);
	}

}

/*Output:
Original liked list: 
[Sweta, Divya, Tejaswini, Riddhi]
After adding element at the front of the linked list:
[Kajal, Sweta, Divya, Tejaswini, Riddhi]
*/
