import java.util.Scanner;
public class SwapNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b;
    a = sc.nextInt();
    b = sc.nextInt();
    
    int c = a;
    a = b;
    b = c;
    
    System.out.print(a+ "");
    System.out.print(b);
  }}

/* Output:
7
5
7 5
*/
