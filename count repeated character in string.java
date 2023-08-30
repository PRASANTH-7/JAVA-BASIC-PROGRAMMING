/* maventic code to count the repeated character in String */

import java.util.*;
public class count repeated character in string {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in); 
      String s=sc.nextLine();
      char ch[]=s.toCharArray();
      int count=0;
      for(int i=0;i<ch.length;i++){
        
        int count1=0;
        for(int j=i+1;j<ch.length;j++){
          
          if(ch[i]!='0' && ch[i]==ch[j]){
            count1++;
            ch[j]='0';
          }
        }
        if(count1>0){
          count++;
        }
      }
      System.out.print(count);
    }
}

/*  output


input1: mississippi                               input2:india
output : 3                                        output:1  */    
       
