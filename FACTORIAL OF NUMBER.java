/* JAVA PROGRAM  TO FIND FACTORIAL OF NUMBERS */


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int fact=1;
      for(int i=1;i<=a;++i)
      {
        fact=fact*i;
      }
      System.out.print(" "+fact);
  }
}
