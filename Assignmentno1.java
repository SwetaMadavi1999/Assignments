/*1.
When the value of count becomes 7 or 15, the continue statement plays its role and skip their execution but for other values of the count, the loop will run smoothly.
consider i =20
solution: */
public class QuestionNo11{
public static void main(String[] args){

for(int i=20;i>=0;i--)
{
  if((i==7)||(i==15))
    {
     continue;
    }
else
    {
     System.out.println(i);
    } 
   }
  }
}
/*2. Write a program in java to display the cube of the number upto given an integer. Go to the editor
Test Data
Input number of terms : 4
Expected Output:
Number is : 4 and cube of 4 is : 64
solution:*/
import java.util.Scanner;

public class QuestionNo12{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Test Data");
System.out.print("Input no of terms :");
long number=sc.nextLong();
System.out.println("Expected Output :");
long cube=(number*number*number);
System.out.println("Number is : "num+" and cube of "+num" is "+cube");
}
}
/*3.  Write a Java program that takes two numbers as input and display the product of two numbers.
 Test Data:
Input first number: 25
Input second number: 5
Expected Output:
25*5=125
Solution:*/
import java.util.Scanner;

public class QuestionNo13{
public static void main(String[] args){
Scanner sc=new Scannner(System.in);
System.out.println("Test Data");
int num1;
int num2;
System.out.print("Input First Number :");
num1=Sc.nextInt();
System.out.print("Input Second Number :");
num2=sc.nextInt();

int product=num1*num2;
System.out.println("Expected Output :");
System.out.println(num1+"*"+num2+"="+product);
}
}

/*4.Write a Java program to print the sum(addition),subtract, multiply, Division, remainder of two numbers. Go to the editor
Test Data:
Input first number : 125
Input second number : 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 * 24 = 3000
125 / 24 = 5
124 mod 24 = 5
solution*/
import java.util.Scanner;

public class QuestionNo14{
public static void main(String[] args){
Scanner sc=new Scannner(System.in);
System.out.println("Test Data");
System.out.print("Input First Number :");
int firstInput=Sc.nextInt();
System.out.print("Input Second Number :");
int secondInput=sc.nextInt();
System.out.println("Expected Output");
int addition=firstInput+secondInput;
System.out.println("firstInput+"+"+secondInput+"=" +addition);
int sub=firstInput-secondInput;
System.out.println("firstInput+"-"+secondInput+"="+sub);
int Multiplication=firstInput*secondInput;
System.out.println("firstInput+"*"+secondInput+"="+Multiplication);
int division=firstInput/secondInput;
System.out.println("firstInput+"/"+secondInput+"="+division);
int percent=firstInput%secondInput;
System.out.println("firstInput+"%"+secondInput+"="+percent);
}
}

/*5.Write a java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
......
8 x 10 = 80
Solution:*/
import java.util.Scanner;

public class QuestionNo15{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Input a number :");
int enterInput=sc.nextInt();
System.out.println("Expected output :");
for(int i=1;i<=10;i++)
{
  int table=enterInput*i;
System.out.println(enterInput+"*"+i+"="+table);
}
}}
/*6.Write a java program to get a number from the user and print whether it is positive or negative.
Test Data:
Input number :35
Expected output :
Number is positive
Solution:*/
import java.util.Scanner;

public class QuestionNo16{
public static void main(String[] agrs){
Scanner sc=new Scanner(System.in);
System.out.println("Test Data");
System.out.print("Input number :");
int num=sc.nextInt();
System.out.println("Expected Output");
if(num>0)
 {
  System.out.println("Number is positive");
 }
else if(num<0)
 {
  System.out.println("Number is negative");
 }
else
 {
  System.out.println("No is zero");
 }
}
}

/*7. Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number : 25
Input the 2nd number : 78
Input the 3rd number : 87
Expected Output :
The Greatest : 87
Solution:*/
import java.util.Scanner;

public class QuestionNo17{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Test Data");
System.out.print("Enter the first number :");
int a=sc.nextInt();
System.out.print("Enter the second number :");
int b=sc.nextInt();
System.out.print("Enter the third number :");
int c=sc.nextInt();
System.out.println("Expected Output");
if(a>b&&a>c)
  {
    System.out.println("The Gretest:" +a);

   }
else if(b>a&&b>c)
 {
  System.out.println("The Gretest:" +b);
 }
else if(c>a&&c>b)
 {
   System.out.println("The Gretest:" +c);
}
else
  {
  System.out.println("Numbers are equals");
 } 

}}

/*8. Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer : 25
Input second integer : 39
Expected Output
25 != 39
25 < 39
25 <= 39
Solution: */
import java.util.Scanner;

public class QuestionNo18{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Input Data: ");
System.out.print("first Integer: ");
int number1=sc.nextInt();
System.out.print("Second Integer: ");
int number2=sc.nextInt();

if( number1==number2 )
{
System.out.println("%d==%d\n ", number1,number2);
}


if( number1!=number2 )
{
System.out.println("%d!=%d\n ", number1,number2);
}

if( number1<number2 )
{
System.out.println("%d<%d\n ", number1,number2);
}
if( number1>number2 )
{
System.out.println("%d>%d\n ", number1,number2);
}

if( number1<=number2 )
{
System.out.println("%d<=%d\n ", number1,number2);
}
if( number1>=number2 )
{
System.out.println("%d>=%d\n ", number1,number2);
}
}
}

/*9.Write a java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
Solution:*/
import java.util.Scanner;

public class QuestionNo19{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("\nInput a word: ");
String word = sc.nextLine();
word = word.trim();
String result = "";
char[] ch=word.toCharArray();
for(int i=ch.length - 1; i >= 0; i--)
{
result += ch[i];
}
System.out.println("Reverse word: "+result.trim());
}
}
/*10.Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to editor
Sample Output:
1
3
5
7
9
11
.....
91
93
95
97
99
Solution:*/
public class QuestionNo110{
public static void main(String[] args){

for(int i=1;i<100;i--)
{
  if(i%2!=0){
System.out.println(i);
}
}
}}
