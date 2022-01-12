package testjava;
import java.util.Scanner;
public class ExceptionHandling01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1 = sc.nextInt();
		System.out.println("Enter second number:");
		int number2 = sc.nextInt();
		new ExceptionHandling01().doDivide(number1,number2);
	}
	public void doDivide(int a, int b) {
		float answer = a/b;
		System.out.println("Answer of the Division"+a+"/"+b+"="+answer);

	}

}

/*Enter first number:
65
Enter second number:
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at testjava/testjava.ExceptionHandling01.doDivide(ExceptionHandling01.java:15)
	at testjava/testjava.ExceptionHandling01.main(ExceptionHandling01.java:12)
*/
