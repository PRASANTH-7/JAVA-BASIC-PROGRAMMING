/* JAVA PRGORAM TO PRINT MINIMUM VALUE IN ARRAY */

import java.util.*;

public class Min_element in array {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
       int min=arr[0];
     for(int i=0;i<arr.length;i++){
    if(arr[i]<min)
      min=arr[i];
    }
     System.out.print(min);
  }
}
