import java.util.ArrayList;
import java.util.Scanner;
public class JoinArray {

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

ArrayList<Integer> element02 = new ArrayList<Integer>();
element02.add(sc.nextInt());
element02.add(sc.nextInt());
element02.add(sc.nextInt());
element02.add(sc.nextInt());
element02.add(sc.nextInt());

System.out.println(element01);
System.out.println(element02);
System.out.println("Add two elements in one element ");

ArrayList elements = new ArrayList<>();
elements.addAll(element01);
elements.addAll(element02);
System.out.println(elements);

	}

}

/*Output:
Enter elements: 
Sweta
Sanskriti
Radha
Diksha
Ankita

23
33
22
34
44
[Sweta, Sanskriti, Radha, Diksha, Ankita]
[23, 33, 22, 34, 44]
Add two elements in one element 
[Sweta, Sanskriti, Radha, Diksha, Ankita, 23, 33, 22, 34, 44]
*/




