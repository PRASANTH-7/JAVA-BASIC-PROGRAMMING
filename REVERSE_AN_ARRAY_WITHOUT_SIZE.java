/* REVERSE OF AN ARRAY WITHOUT GETTING ANY SIZE */

import java.util.*;
import java.util.Scanner;
public class Array_Reverse_without_size{
  public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String arr[]=s.split(" ");
    
    for(int i=0;i<arr.length;i++) {
    	Integer.parseInt(arr[i]);
    	
    }
    System.out.print("Reverse of an array is:");
    for(int i=arr.length-1;i>=0;--i) {
    	System.out.print(arr[i]);	
    } 
  }
}
