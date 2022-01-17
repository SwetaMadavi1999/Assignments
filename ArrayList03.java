import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
  public static void main(String[] args) {
    List<String> list01 = new ArrayList<String>();
    list01.add("Pooja");
    list01.add("Sanskriti");
    list01.add("Sweta");
    list01.add("Prisha");
    System.out.println("First Array list is: "+list01);
    
    List<String>list02 = new ArrayList<String>();
    list02.add("Red");
    list02.add("Purple");
    list02.add("Green");
    list02.add("Pink");
    System.out.println("Second Array list is : "+list02);
    
    Collections.copy(list01, list02);
    System.out.println("Copy List01 to List02"+"\nAfter Copy: ");
    System.out.println(list01);
    System.out.println(list02);
  }}

/*
Output:
First Array list is: [Pooja, Sanskriti, Sweta, Prisha]
Second Array list is : [Red, Purple, Green, Pink]
Copy List01 to List02
After Copy: 
[Red, Purple, Green, Pink]
[Red, Purple, Green, Pink]
*/
