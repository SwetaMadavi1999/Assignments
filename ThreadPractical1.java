/*  Write the  programme with int i=2;i<=5,i++. Show the resulting output. Repeat the same programme for int=3;i<=6,i++. */
// For 1st part
class Table{
synchronized void printTable(int n){
for(int i=1;i<=5;i++){
System.out.println(n*i);
try{
Thread.sleep(400);
}catch(Exception e){System.out.println(e);}
}
}
}
public class TestSynchronization3{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread(){
public void run(){
obj.printTable(5);

}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(100);
}
};
t1.start();
t2.start();
}
}
/* Output:
5
10
15
20
25
100
200
300
400
500 */


// For second part
class Table2{
synchronized void printTable(int n){
for(int i=1;i<=6;i++){
System.out.println(n*i);
try{
Thread.sleep(400);
}catch(Exception e){System.out.println(e);}
}
}
}
public class TestSynchronization2{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread(){
public void run(){
obj.printTable(2);
}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(10);
}
};
t1.start();
t2.start();
}
}
/* Output:
4
6
8
10
12
20
30
40
50
60
*/
