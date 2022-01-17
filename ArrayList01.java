import java.util.*;


public class Arraylist01{
public static void main(String[] args){
List<String> list_String = new ArrayList<String>();
list_Strings.add("Rose");
list_Strings.add("Lotus");
list_Strings.add("Lily");
list_Strings.add("Sunflower");
list_Strings.add("Jasmine");
System.out.println(list_Strings);

Iterator<String>itrIterable=list_String.iterator();
while(itrIterable.hasNext()){
System.out.println(itrIterable.next());
}}}
/*Output:
[ Rose, Lotus, Lily, Sunflower, Jasmine]
Rose
Lotus
Lily
Sunflower
Jasmine
*/
