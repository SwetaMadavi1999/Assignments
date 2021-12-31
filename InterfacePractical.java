/* Write a  programme for the object Boy and value of int
b = 7. Write it again for the object Girl and the value of int c=9. */
// for first part
import java.io.*;
interface in1
{
final int b = 7;
void display();
}
class testClass implements in1
{
public void display()
{
System.out.println("Boy");
}
public static void main (String[] args)
{
testClass t = new testClass();
t.display();
System.out.println(b);
}
}

// for second part

import java.io.*;
interface in2
{
final int c = 5;
void display();
}
class testClass1 implements in2
{
public void display()
{
System.out.println("Girl");
}
public static void main (String[] args)
{
testClass1 t = new testClass1();
t.display();
System.out.println(c);
}
}
