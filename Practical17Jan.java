package testjava;
import java.util.Scanner;
public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number: ");
int num1 = sc.nextInt();
System.out.print("Enter second number: ");
int num2 = sc.nextInt();

System.out.println("Addition:"+(num1+num2));
System.out.println("Subtraction:"+(num1-num2));
System.out.println("Multiplication:"+(num1*num2));
System.out.println("Division:"+(num1/num2));
System.out.println("Average:"+(num1+num2)/2);

if(num1>num2) {
	System.out.println("Greatest Number is:"+num1);}
if(num2>num1) {
	System.out.println("Greatest Number is:"+num2);}
if(num1<num2) {
	System.out.println("Smallest Number is:"+num1);
}
if(num1>num2) {
	System.out.println("Smallest Number is:"+num2);
}
else {
	System.out.println("The Maximum and minimum number is:"+(num1));
}
}
}

/* Output:
Enter first number: 50
Enter second number: 25
Addition:75
Subtraction:25
Multiplication:1250
Division:2
Average:37
Greatest Number is:50
Smallest Number is:25
*/
