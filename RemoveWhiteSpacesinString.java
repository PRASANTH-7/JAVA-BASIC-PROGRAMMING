import java.util.Scanner;
public class  RemoveWhiteSpacesinString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       String s=sc.nextLine();
       
       s=s.replace(" ","");
       
       System.out.println(s.length());
}
}
