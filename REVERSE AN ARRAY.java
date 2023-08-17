/* JAVA PROGRAM TO REVERSE AN ARRAY */


import java.util.*;
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    
    int size=sc.nextInt();
    
    int array[]=new int[size];
    
    for(int i=0;i<size;i++){
      
      array[i]=sc.nextInt();
      
    }
    
    for(int i=array.length-1;i>=0;--i){
      System.out.print(" "+array[i]);
    }
    
    
  }
}
