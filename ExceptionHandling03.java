package testjava;
import java.util.Scanner;
public class ExceptionHandling03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number: ");
int number1 = sc.nextInt();
System.out.println("Enter Second Number: ");
int number2 = sc.nextInt();

try {
	new ExceptionHandling03().doDivide(number1, number2);
}
catch(Exception e) {
	System.out.println("Exception Condition programme is ending:");
}


	}
	public void doDivide(int p, int q) throws Exception{
		float answer = p/q;
		System.out.println("Answer of the given problem"+p+"/"+q+"="+answer);
	}

}

/*
Output:
Enter First Number: 
45
Enter Second Number: 
0
Exception Condition programme is ending:

Output1:
Enter First Number: 
36
Enter Second Number: 
9
Answer of the given problem36/9=4.0
*/
