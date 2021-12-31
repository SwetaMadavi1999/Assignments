/*Write the  programme to throw the exception string
value “invalid” if integer value of age is less than 22, with else condition “welcome aboard”. Validate for age
value 19.  Repeat the same programme to validate for age value 24.*/
// for 1st part
public class ThrowDemo1{
static void validate(int age){
if(age<22)
throw new ArithmeticException("Invalid");
else
System.out.println("Welcome aboard");
}
public static void main(String args[]){
validate(19);
System.out.println("code remainder");
}
}

//for second part

  public class ThrowDemo2{
static void validate(int age){
if(age<22)
throw new ArithmeticException("invalid");
else
System.out.println("welcome aboard");
}
public static void main(String args[]){
validate(24);
System.out.println("code remainder");
}
}
