import java.util.*;

public class Maventic_pattern {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int size = sc.nextInt();

        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==1||i==size||j==1||j==size){
                    System.out.print("* ");
                }
                else if(i==j||i+j==size+1||j==size-i+1||j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
                System.out.println();
            
        }
    }
}
