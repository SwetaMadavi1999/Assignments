import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Arraylist02{
public static void main(String[] args){
List<String> list = new ArrayList<String>();
list.add("Rose");
list.add("Lotus");
list.add("Lily");
list.add("Sunflower");
list.add("Jasmine");
  System.out.print("Elements of arrays are: ");
System.out.println(list);
list.set(3,"Daisy");
  System.out.print("Updated specific elements are: ");
  System.out.print(list);

}}
/*Output:
Elements of arrays are: [Rose, Lotus, Lily, Sunflower, Jasmine]
Updated specific elements are: [Rose, Lotus, Lily, Daisy, Jasmine]
*/
