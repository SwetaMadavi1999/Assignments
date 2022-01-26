// Write a java program to clone an array list to another array list.

import java.util.ArrayList;
import java.util.Scanner;
public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements: ");
ArrayList<String>elements = new ArrayList<String>();
elements.add(sc.next());
elements.add(sc.next());
elements.add(sc.next());
elements.add(sc.next());
elements.add(sc.next());

ArrayList<String>element01 =(ArrayList<String>)elements.clone();
System.out.println(element01);
	}

}
 /* Output:
 
 Enter elements: 
Sweta
Nandini
Pooja
Poornima
Neha
[Sweta, Nandini, Pooja, Poornima, Neha]
*/
