/* SORT FIRST HALF IN ASCENDING ORDER AND SECOND HALF IN DESCENDING ORDER */

import java.util.*;
public class Main{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int arr[]=new int[N];
    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }
   Arrays.sort(arr);
   
   for(int i=0;i<N/2;i++){
     System.out.print(arr[i]+" ");
    }
   
   for(int i=N-1;i>=N/2;i--){
    System.out.print(arr[i]+" ");
   }
   
   
  }
}
