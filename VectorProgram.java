package testjava;
import java.util.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class VectorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> list = new Vector<Integer>();
list.add(16);
list.add(13);
list.add(15);
list.add(14);
System.out.println("Number present in array are: "+list);
    Iterator<Integer>iterator=list.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
	}
  }
}
