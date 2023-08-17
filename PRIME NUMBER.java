/* JAVA PROGRAM TO FIND PRIME NUMBER */

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      boolean a=false;
      for(int i=2;i<n;i++){
        if(n%i==0)
        a=true;
        break;
      }
      if(!a)
      System.out.print("yes");
      else
      System.out.print("no");
  }
}
