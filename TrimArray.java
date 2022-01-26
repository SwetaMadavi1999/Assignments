import java.util.*;

public class TrimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the elements: ");
ArrayList<String>elements=new ArrayList<String>();
elements.add(sc.next());
elements.add(sc.next());
elements.add(sc.next());
elements.add(sc.next());
elements.add(sc.next());
elements.trimToSize();
System.out.println(elements);
	}

}

/* Output:

Sweta
Prisha
Kriya
Alisha
Sanskriti
[Sweta, Prisha, Kriya, Alisha, Sanskriti]
*/
