// Write a java program to empty an array list.

import java.util.ArrayList;
import java.util.Scanner;
public class EmptyArray {

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
		
		element01.removeAll(element01);
		System.out.println(element01);
	}

}

/*Output:

Enter elements: 
Divya
Roshani
Rikki
Sweta
Ekta
[]
*/
