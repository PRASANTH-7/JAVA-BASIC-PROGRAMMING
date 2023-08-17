/* JAVA PROGRAM TO REMOVE VOWELS IN STRING */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
    char ch[]=s.toCharArray();
    for(int i=0;i<ch.length;i++){
      if(!((ch[i]=='A')||(ch[i]=='a')||(ch[i]=='E')||(ch[i]=='e')||(ch[i]=='I')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='O')||(ch[i]=='U')||(ch[i]=='u'))){
       System.out.print(ch[i]);      
}
    }
  }
}
