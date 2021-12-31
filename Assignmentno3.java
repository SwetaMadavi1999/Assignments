// 1st Question
Public class program01 {
public static void main(String[] args){
Char chs = 's';
int number = 44;
chs = 'c';
}}

// Question2
Public class program02 {
public static void main(String[] args){
int i = 200;
long l = i;
float f = l;
system.out.println("Int value: " +i);
System.out.println("Long value: " +l);
System.out.println("Float value: " +f);
}}

// Question3
Public class program03 {
public static void main(String[] args){
double d = 200.32;
long l = (long)d;
int i = (int)l;
System.out.println("Double value: "+d);
System.out.println("Long value: " +l);
System.out.println("Int value: " +i);
}}

// Question4
Public class program04 {
public static void main(String[] args){
byte b;
int i = 321;
double d = 432.32;
System.out.println("Conversion of int to byte.");
b = (byte)i;
System.out.println("i = "+i "b = " +b);
System.out.println("\nConversion of double to byte.");
b = (byte)d;
System.out.println("d = " +d+ "b = " +b);
}}

//Question5
 Public class program05 {
public static void main(String[] args){
byte a = 32;
char r = 's';
short s = 1021;
int i = 39999;
float f = 4.22f;
double d = 332.222;
double answer = (f*a)+(i/r)-(d*s);
System.out.println("Answer = " +answer);}}

//Question06
Public class program06 {
public static void main(String[] args){
byte q = 40;
q = (byte)(q*2);
System.out.println(q);}}

//Question07
import java.util.Arrays;
Public class program07 {
public static void main(String[] args){
int[] array = { 21, 11, 13, 5, 7, 56, 321, 654};
Arrays.sort(array);
System.out.println("Modified array[] : "%s",Array.toString(array));
}}

// Question08
import java.util.Arrays;
import java.util.Collections;
Public class program08 {
public static void main(String[] args){
String arr[] = {"practice.geeksforgeeks.org","quiz.geeksforgeeks.org","code.geeksforgeeks.org"};
Arrays.sort(arr);
System.out.printf("Modified arr[] :\n%\n\n", Arrays.toString(arr));
Arrays.sort(arr,Collections.reverseOrder());
System.out.printf("Modified arr[] : \n%s\n\n", Arrays.toString(arr));
}}
// Question09
import java.util.*;
Public class program09 {
public static void main(String[] args){
ArrayList<String> al = new ArrayList<String>();
al.add("Geeks For Geeks");
al.add("Friends");
al.add("Dear");
al.add("Is");
al.add("Superb");
Collections.sort(al);
System.out.println("List after the use of " + "Collection.sort() : \n" +al);
}}


