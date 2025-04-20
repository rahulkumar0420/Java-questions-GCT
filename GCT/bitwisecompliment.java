import java.util.Scanner;

public class bitwisecompliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "  Bitwise compliment of a number\n");

        System.out.print("Enter the  Number : ");
        int num1 = sc.nextInt();

    
        int result = ~ num1 ; 

        System.out.println("The result of Bitwise Operator is : " + result);
    }
}
