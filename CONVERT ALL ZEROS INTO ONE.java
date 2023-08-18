/* JAVA PROGRAM TO CONVERT ALL THE ZEROS INTO ONE */
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt(); 
      String s=Integer.toString(num);
      String t="";
      for(int i=0;i<s.length();i++){
         if(s.charAt(i) == '0')
				t = t + '1';
			else
				t = t + s.charAt(i);
      }
      System.out.println(t);  
  }
}
