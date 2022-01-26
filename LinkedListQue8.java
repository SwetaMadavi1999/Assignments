// Write a Java program to insert the specific element at the end of the linked list.

package LinkedList;
import java.util.LinkedList;

public class Ouestion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>element01 = new LinkedList<String>();
		element01.add("Nandini");
		element01.add("Sanskriti");
		element01.add("Tejaswini");
		element01.add("Riddhi");

		System.out.println("Original liked list: \n"+element01);
		element01.addLast("Prisha");
		System.out.println("After adding element at the last of the linked list:\n"+element01);
	
	}

}

/* Output:
Original liked list: 
[Nandini, Sanskriti, Tejaswini, Riddhi]
After adding element at the last of the linked list:
[Nandini, Sanskriti, Tejaswini, Riddhi, Prisha]
*/
