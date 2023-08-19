/* METHOD PROGRAM */
import java.util.*;
public class Multiply_method{
  
  public void add(int x,int y){
   System.out.println(x*y);   
  }
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt(); 
  Main obj=new Main();
  obj.add(a,b);
  }
}
