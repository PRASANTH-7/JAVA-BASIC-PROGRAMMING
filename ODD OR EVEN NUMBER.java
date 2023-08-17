/* JAVA PROGRAM TO PRINT ODD NUMBER OR EVEN NUMBER */

import java.util.Scanner;
public class Ascii_value_for_number
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
	   
	   if(number%2==0){
	     System.out.println("EVEN NUMBER");
	   }
	   else
	   {
	     System.out.println("ODD NUMBER");
	   }
	}
}
