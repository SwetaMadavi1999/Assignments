package testjava;
import java.util.Scanner;
public class ExceptionHandling02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number(Numerator): ");
int numerator = sc.nextInt();
System.out.println("Enter Second number(Denominator): ");
int denominator = sc.nextInt();
new ExceptionHandling02().doDivide(numerator,denominator);

	}
public void doDivide(int p, int q) {
	try {
		float answer = p/q;
		System.out.println("Answer of the given problem:"+p+"/"+q+"="+answer);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception Condition Programme is ending");
	}
}
}
/* 
Output when exception exist:
Enter first number(Numerator): 
25
Enter Second number(Denominator): 
0
Exception Condition Programme is ending


Output when exception not exist:
Enter first number(Numerator): 
34
Enter Second number(Denominator): 
17
Answer of the given problem:34/17=2.0   */

