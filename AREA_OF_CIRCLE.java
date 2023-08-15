/* JAVA PROGRAM TO FIND AREA OF CIRCLE */

import java.util.*;
public class AREA_OF_CIRCLE {

  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
  
  int number=sc.nextInt();
  
  float pi=3.14f;
  
  int radius=number*number;
  
  float area=pi*(float)radius;
  
  System.out.println(area);
  
  }
}
