// Question1
import class Question01{
  int length;
  int width;
  int height;
  public void set_length(int 1)
  {
    this.length = 1;
  }
  public void set_height(int h){
    this.height = w;
  }
  public void volume(){
    System.out.println(length*width*height);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int width = sc.nextInt();
    int height = sc.nextInt();
    
    Question01 cuboid = new Question01();
    cuboid.set_length(length);
    cuboid.set_width(width);
    cuboid.set_height(height);
    cuboid.volume();}}

/*Write a java program to sort a numeric array and a string array*/
import java.util.Arrays;
public class Question02 {
  public static void main(String[] args){
    int[] num = { 12, 15, 23, 16,19};
    String[] nameString = {"Sweta", "Sanskriti", "Bhawana","Tejaswini", "Prisha"};
    Arrays.sort(num);
    Arrays.sort(nameString);
    System.out.println(Arrays.toString(num));
    System.out.println(Arrays.toString(nameString));}}

/*2. Write a Java program to sum values of array.*/
public class Question03{
public static void main(String[] args){
int sum =0;
int[] array = { 32,44,56,76,89,44};
for ( int i=0; i<array.length;i++){
sum+=array[i];}
System.out.println(sum);}
  
  /*Write a java program to print the following grid.
  Expected Output:
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -
  - - - - - - - - - -  */
  public class Question04{
    public static void main(String[] args){
      int[][] number = new int[10][10];
      for(int i=0; i<number.length; i++){
        for(int j=0; j<number.length; j++){
          System.out.println("-",number[i][j]);
        }
        System.out.println();}}}
  
  //Write a Java program to calculate the average value of array elements.
  public class Question05{
    public static void main(String[] args){
      double avg;
      double sum=0;
      double[] number = {33,53,22,14,64,55,87,54,47,32};
      for(int i=0;i<number.length;i++){
        sum+=num[i];
      }
      System.out.println("Average value:"+(avg=sum/number.length));
    }}
  // Write a Java program to test if an array contains a specific value.
  import java.util.Iterator;
  public class Question05{
    public static Boolean contains(int[] array,int item){
      for(int n:array){
        if(n==item){
          return true;}
      }
      return false;
    }
    public static void main(String[] args){
      int[] my_array1 = {2013,2015,2017,2019,2021,2023,2029,2049};
      System.out.println(contains(my_array1,2021));
      System.out.println(contains(my_array1,2020));}}
      
   
  
