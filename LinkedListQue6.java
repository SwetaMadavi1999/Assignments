// Write a Java program to insert elements into the linked list at the first and last position.

import java.util.*;

public class Question00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>element01 = new LinkedList<String>();
element01.add("Sweta");
element01.add("Divya");
element01.add("Tejaswini");

System.out.println("Before insert  elements into linked list: \n"+element01);
element01.addFirst("Kajal");
element01.addLast("Samiksha");

System.out.println("After insert  elements into liked list: ");
System.out.println(element01);

	}

}

/* Output: 
Before insert  elements into linked list: 
[Sweta, Divya, Tejaswini]
After insert  elements into liked list: 
[Kajal, Sweta, Divya, Tejaswini, Samiksha]
*/
