/* JAVA PROGRAM TO GET INPUT FROM USER */


import java.util.Scanner;

public class Inputs_In_Java {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter integer number:");
      int number1=sc.nextInt();     // TO GET INTEGER INPUT
      System.out.println("Integer is:"+number1);
      
      
      System.out.println("Enter float number:");
      float number2=sc.nextFloat();    // TO GET FLOATING INPUT
      System.out.println("Float number is:"+number2);
      
      
      System.out.println("Enter character:");
      char Char=sc.next().charAt(0);        // TO GET CHARACTER INPUT
      System.out.println("The character is:"+Char);
      
      System.out.println("Enter double number:");
      double d=sc.nextDouble();            // TO GET DOUBLE INPUT
      System.out.println("Double number is:"+d);
      
      System.out.println("Enter a string:");
      String s=sc.nextLine();               // TO GET STRING INPUT
      System.out.println("String is:"+s); 
  }
}
