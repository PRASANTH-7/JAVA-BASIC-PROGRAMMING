/* JAVA PROGRAM TO FIND LEAP YEAR */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      if(num%4==0 || num%400==0 && num%100!=0)
      {
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
  }
}
