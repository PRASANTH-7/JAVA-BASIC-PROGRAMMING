/* JAVA PROGRAM TO COUNT NUMBER OF DIGITS */

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter an Integer: ");
int num = sc.nextInt();
int count = 0;
if(num==0)
System.out.print("Number of Digits = 1");
else{
while(num != 0)
{
count++;
num = num / 10;
}
System.out.print("Number of Digits is "+count);
}
}
}
