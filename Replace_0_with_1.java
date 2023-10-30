import java.util.*;
public class Replace_0_with_1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      String str=Integer.toString(s);
      String str1="";
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0'){
          str1=str1+'1';
        }
        else{
          str1=str1+str.charAt(i);
        }
        
      }
      System.out.print(str1);
  }
}
