/* JAVA PROGRAM TO REVERSE A STRING */

import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String reverse="";
      int length=s.length();
      for(int i=length-1;i>=0;--i){
        reverse=reverse+s.charAt(i);
        
      }
      System.out.println(reverse);
  }
}
