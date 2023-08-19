

/* Two or more methods may have the same name if they differ in parameters (different number of parameters, different types of parameters, or both). These methods are called overloaded methods 
   and this feature is called method overloading. */

import java.util.*;

public class Method_overloading_example{

  public void add(int x,int y){
   
   System.out.println(x*y);
    
  }
  public void add(int x,int y,int z){
    
    System.out.println(x*y*z);
  }
  
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  Main obj=new Main();
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  
    obj.add(a,b,c);
    obj.add(a,c);
  }
}
