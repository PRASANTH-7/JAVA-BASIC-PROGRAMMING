import java.util.*;
public class  Reverse a string using stack{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
 
 Stack<Character> st=new Stack<>();
 String g=sc.nextLine();
 for(int i=0;i<g.length();i++)
{
   st.push(g.charAt(i));
   
 }
 
 for(int i=st.size()-1;i>=0;i--){
   
   System.out.print(st.pop()+"");
 }

}
  }
