
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Arraylist04{
public static void main(String[] args){
List<Integer> list = new ArrayList<Integer>();
list.add(23);
list.add(20);
list.add(22);
list.add(19);
list.add(21);
  System.out.println("Before Sorting Array: "+list);
  Collections.sort(list);
  System.out.println("After sorting Array:" +list);
}}

/* Output:
Before Sorting Array: [23, 20, 22, 19, 21]
After sorting Array:[19, 20, 21, 22, 23]
*/
