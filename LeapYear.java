package testjava;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year");
int year = sc.nextInt();
if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
	System.out.println("Enter year is leap year");
}
else {
	System.out.println("Enter year is not leap year");
}

	}

}
/* Output:
Enter the year
2000
Enter year is leap year
*/
