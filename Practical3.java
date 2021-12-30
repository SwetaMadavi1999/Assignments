/* Take a three numbers from the user and print the greatest number.*/
import java.util.Scanner;
public class LoopExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("1st Number: ");
int num1 = sc.nextInt();
System.out.print("2nd Number: ");
int num2 = sc.nextInt();
System.out.print("3rd Number: ");
int num3 = sc.nextInt();

if(num1>num2&&num1>num3) {
	System.out.println("The Gretest:"+num1);
	
}
else if(num2>num3&&num2>num1) {
	System.out.println("The Grestest:"+num2);
	
}
else if(num3>num1&&num3>num2) {
	System.out.println("The Gretest: "+num3);
}
else {
	System.out.println("numbers are equal.");
}
	}
}

/* Write a Java Program to get a number from the user and print whether it is positive or negative.*/
import java.util.Scanner;
public class LoopExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Input number:");
int number = input.nextInt();
if(number>0)
{
	System.out.println("Number is positive.");
	
}
else {
	System.out.println("Number is negative.");
}
	}

}

/* Write a Java program to solve quadratic equations (use if,else if,and else). */
import java.util.Scanner;
public class PracticalNo3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in):
    System.out.print("Enter the value of a: ");
    double a = sc.nextDouble();
    System.out.print("Enter the value of b: ");
    double a = sc.nextDouble();
    System.out.print("Enter the value of c: ");
    double a = sc.nextDouble();
    double answer = b * b - 4.0 * a * c;
   
    if(answer > 0.0) {
      double x1 = (-b + Math.pow(answer, 0.5)) / (2.0 * a);
      double x2 = (-b - Math.pow(answer, 0.5)) / (2.0 * a);
      System.out.println("The roots are "+x1 + "and" +x2);
    }
    else if(answer == 0.0) {
      double x1 = -b / (2.0 * a);
      System.out.println("The root is " +x1);}
    else{
      System.out.println("The equation has no real roots.");
    }}}

/* Write a Java program that reads a floating-points number and prints"Zero" if the number is zero. otherwise print "positive" or "negative". Add "small" if the absolute of the number is less than1,
or"large" if it exceeds 1,000,000 */
import java.util.Scanner;
public class LoopExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number: ");
    double input = sc.nextDouble();
    if(input > 1)
    {
      if(input < 1){
        System.out.println("positive small number");
      }
      else if (input > 1000000){
        System.out.println("positive large number");
      }
      else {
        System.out.println("Positive number");
      }
    }
    else if (input < 0){
      if (Math.abs(input) < 1){
        System.out.println("Negative small number");
      }
      else if( Math.abs(input) > 1000000){
        System.out.println("Negative large number");
      }
else {
  System.out.println("Negative number");
}
    }
    else{
      System.out.println("Zero");
    }}
  
  /* Write a program in Java to display the first 10 natural numbers. */
  public class LoopExample {
    public static void main(String[] args){
      int i;
      System.out.println ("The first 10 natural numbers are:\n");
      for ( i=1;i<=10;i++)
      {
        System.out.println(i);
      }
      System.out.println("\n");}}
      
      

