package testjava;
import java.util.Scanner;
public class OperationThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    float w=0.0f, x=0.0f, y=0.0f;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Three Numbers:");
		    w = sc.nextFloat();
		    x = sc.nextFloat();
		    y = sc.nextFloat();
		    float sum = w+x+y;
		    float division = w/x/y;
		    float mul = w*x*y;
		    float avg = (w+x+y)/3;
		    System.out.println("Sum of the three numbers: "+sum);
		    System.out.println("Division of the three numbers: "+division); 
		     System.out.println("Multiplication of the three numbers: "+mul);
		     System.out.println("Average of the three numbers: "+avg);
		    
		    if(w>=x&&w>=y) {
		       System.out.println("Maximum Number is: "+w);
		    }
		    else if(x>=w&&x>=y){
		       System.out.println("Maximum Number is: "+x);}
		    else if(y>=w&&y>=x){
		       System.out.println("Maximum Number is: "+y);}
		    
		    if(w<=x&&w<=y){
		       System.out.println("Minimum Number is:  "+w);}
		      
		    if(x<=w&&x<=y){
		       System.out.println("Minimum Number is:  "+x);}
		      
		    if(y<=x&&y<=w){
		       System.out.println("Minimum Number is:  "+y);}}}

/* Output:
Enter Three Numbers:
45
76
32
Sum of the three numbers: 153.0
Division of the three numbers: 0.01850329
Multiplication of the three numbers: 109440.0
Average of the three numbers: 51.0
Maximum Number is: 76.0
Minimum Number is:  32.0
*/
