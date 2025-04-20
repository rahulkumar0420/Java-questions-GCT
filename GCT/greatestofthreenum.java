
import java.util.Scanner;

public class greatestofthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the value of B : ");
        int b = sc.nextInt();
        
        System.out.print("Enter the value of C : ");
        int c = sc.nextInt();

        if(a > b &a > c){
            System.out.println("A is Greater");
        }else if( b > c){
            System.out.println("B is Greater");
        }else{
            System.out.println("C is Greater");
        }
    }
}
