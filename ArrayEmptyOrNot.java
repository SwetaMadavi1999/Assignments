// Write a java program to test an array list is empty or not.

import java.util.*;
public class EmptyArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements: ");
		ArrayList<String> element01 = new ArrayList<String>();
		element01.add(sc.next());
		element01.add(sc.next());
		element01.add(sc.next());
		element01.add(sc.next());
		element01.add(sc.next());
		
		System.out.println(element01.isEmpty());
		element01.isEmpty();
		System.out.println(element01.removeAll(element01));
	}

}

/*Output:
Enter elements: 
Sweta
Swara
Tejaswini
Kajal
Riddhi
false
true
*/
