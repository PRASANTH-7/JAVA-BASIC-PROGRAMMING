import java.util.*;
public class TreeSetWithoutSize {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Set<Integer> s=new TreeSet<>();
      while(sc.hasNext()){
        s.add(sc.nextInt());
      }
      System.out.println(s);  
  }
}
