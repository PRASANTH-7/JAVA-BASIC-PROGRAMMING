/* JAVA PROGRAM TO PRINT ASCII CHARACTER FOR NUMBER */

import java.util.Scanner;
public class Ascii_character
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		System.out.println("ASCII VALUE IS: "+(char)number);
	}
}
