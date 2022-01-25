import java.util.Scanner;
public class SwapNum01{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
  int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("Before swapping : "+a+" " +b);
    System.out.println();
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After Swapping : "+a+" "+b);
    System.out.println();
  }}

 /* Output:
 Enter first number: 
23
Enter second number: 78
Before swapping : 23 78

After Swapping : 78 23
*/
    
    
