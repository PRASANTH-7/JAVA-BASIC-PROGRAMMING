import java.util.*;
public class Recursion { 
 static int rec(int a){
    if(a==0) 
    return 1;
    else
      return a*rec(a-1); 
   }  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(rec(n));    
  }
}
