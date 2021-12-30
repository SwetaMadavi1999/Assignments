/*1.To convert string into lowercase
example 1:
input ="ABcddE"
output ="abcdde"
 example 2:
input ="LMNoppQQ"
output ="lmnoppqq"

  solution-*/
import java.util.Scanner;
public class Question1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String sc = input.nextLine();
    sc = sc.toLowerCase();
    System.out.println(sc);
    
    String sc = input.nextLine();
    pc = sc.toLowerCase();
    System.out.println(pc);}}

/* Reverse the string:
  example 1:
  input: s="GeeksforGeeks"
  output: "skeeGrofskeeG"
example2:
   input: S="ReversE"
   output: "EsreveR"
  solution:*/
import java.util.Scanner;
public class Question2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuffer ss= new StringBuffer(s);
    ss.reverse();
    System.out.println(ss);
    
    String cr = sc.nextLine();
    StringBuffer sn = new StringBuffer(cr);
    sn.reverse();
    System.out.println(sn); }}

/*example on inheritance:
  input:
  1
  2 4
  output:
  6 
  8
  20

  solution:*/
import java.util.Scanner;
class Cls1{
  void add(int p, int q){
    System.out.println(p+q);
  }}
class Cls2 extends Cls1{
  void mul(int p, int q){
    System.out.println(p*q);
  }
  void task(int p, int q){
    System.out.println((p*p)+(q*q));}
}
public class Question3 extends Cls2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    Cls2 math = new Cls2();
    math.add(p,q);
    math.mul(p,q);
    math.task(p,q);}}

