/* Write the  programme with integer
values 40, 70 and 30. Execute the programme again for integer values 80, 75 and 60. */
// For the first part
 class ClassMain{
void disp(int number){
System.out.println ("method:" + number);
}
void disp(int number1, int number2){
System.out.println ("method:" + number1 + "," + number2);
}
double disp(double number) {
System.out.println("method:" + number);
return num;
}
}
class CompileTimePolymorphismDemo
{
public static void main (String args [])
{
ClassMain obj = new ClassMain();
double result;

obj.disp(40);
obj.disp(70, 30);
result = obj.disp(6.1);
System.out.println("Answer is:" + result);
}
}
//For second part
 class ClassMain1{
void disp(int number){
System.out.println ("method:" + number);
}
void disp(int number1, int number2){
System.out.println ("method:" + number1 + "," + number2);
}
double disp(double number) {
System.out.println("method:" + number);
return num;
}
}
class CompileTimePolymorphismDemo1
{
public static void main (String args [])
{
ClassMain obj = new ClassMain();
double result;

obj.disp(80);
obj.disp(75, 60);
result = obj.disp(6.1);
System.out.println("Answer is:" + result);
}
}
