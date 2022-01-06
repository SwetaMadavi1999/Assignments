//Question1  :  Sorting

package testjava;
import java.util.Arrays;
public class JavaArraySort1 {
	

	public static void main(String[] args) {
	int[] intArr = {6, 10, 9, 12, 8};
	String[] strArr = {"I", "U", "A","E","O"};
	Arrays.sort(intArr);
	Arrays.sort(strArr);
	System.out.println(Arrays.toString(intArr));
	System.out.println(Arrays.toString(strArr));}}
  
/*Expected Output:
[10, 12, 16, 18, 119]
[A, E, I, O, U]
*/
// Question2  : Searching
package testjava;
import java.util.Arrays;
public class BinarySearchExample11 {
	
	    public static void main(String args[]){  
	        int arr[] = {10,70,600,740,850};  
	        int key = 740;  
	        int result = Arrays.binarySearch(arr,key);  
	        if (result < 0) { 
	            System.out.println("Element is not found!"); } 
	        else  {
	            System.out.println("Element is found at index: "+result);  }
	    }  
}

/* Expected Output:
Element is found at index: 3*/

// Question3   : Call By Value
package testjava;

public class CallByValue {
	
		   public static void main(String[] args){
		      int a = 30;
		      int b = 45;
		      System.out.println("Before swapping, a = " + a + " and b = " + b);
		      swapFunction(a, b);
		      System.out.println("\n*Now, Before and After swapping values will be same here*:");
		      System.out.println("After swapping, a = " + a + " and b is " + b);
		   }
		   public static void swapFunction(int a, int b) {
		      System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
		      int c = a;
		      a = b;
		      b = c;
		      System.out.println("After swapping(Inside), a = " + a + " b = " + b);
		   }

}
/* Expected Output:
Before swapping, a = 30 and b = 45
Before swapping(Inside), a = 30 b = 45
After swapping(Inside), a = 45 b = 30

*Now, Before and After swapping values will be same here*:
After swapping, a = 30 and b is 45  */

// Question 4   :  Call By Reference

package testjava;

public class CallByReference {
	
		   public static void main(String[] args) {
		      IntWrapper a = new IntWrapper(30);
		      IntWrapper b = new IntWrapper(45);
		      System.out.println("Before swapping, a = " + a.a + " and b = " + b.a);
		      swapFunction(a, b);
		      System.out.println("\n*Now, Before and After swapping values will be different here*:");
		      System.out.println("After swapping, a = " + a.a + " and b is " + b.a);
		   }
		   public static void swapFunction(IntWrapper a, IntWrapper b) {
		      System.out.println("Before swapping(Inside), a = " + a.a + " b = " + b.a);
		      IntWrapper c = new IntWrapper(a.a);
		      a.a = b.a;
		      b.a = c.a;
		      System.out.println("After swapping(Inside), a = " + a.a + " b = " + b.a);
		   }
		}
		class IntWrapper {
		   public int a;
		   public IntWrapper(int a){ this.a = a;}
		}
/* Expected Output:
Before swapping, a = 30 and b = 45
Before swapping(Inside), a = 30 b = 45
After swapping(Inside), a = 45 b = 30

*Now, Before and After swapping values will be different here*:
After swapping, a = 45 and b is 30  */



