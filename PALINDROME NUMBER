/* JAVA PROGRAM TO FIND THE NUMBER IS PALINDROME OR NOT*/


import java.util.Scanner;
public class Palindrome_number
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 int number=sc.nextInt(); 
	int temp=number;
	int reverse=0;
	int remainder=0;
	while(number!=0){
	  remainder=number%10;
	  reverse=reverse*10+remainder;
	  number=number/10;
	}
	if(reverse==temp){
	  System.out.println("Palindrome number");
	}
	else
	{
	  System.out.println("Not Palindrome number");
	}
	}
}
