package testjava;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
int num = sc.nextInt();
int mul=0;
for(int i=1;i<=10;i++) {
	
mul=i*num;
System.out.println(num+"*"+i+"="+mul);


}	

}}

/*Output:
Enter the number:8
8*1=8
8*2=16
8*3=24
8*4=32
8*5=40
8*6=48
8*7=56
8*8=64
8*9=72
8*10=80
*/
