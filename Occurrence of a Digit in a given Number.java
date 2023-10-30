
import java.util.*;
public class Occurrence of a Digit in a given Number{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      int search=sc.nextInt();
      
      int count=0;
      int rem=0;
      
      while(number!=0){
        rem=number%10;
        if(rem==search)
        count++;
        number/=10;
      }
      System.out.println(count);
     
  }
}
