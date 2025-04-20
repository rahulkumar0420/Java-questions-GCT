
import java.util.Scanner;

public class Andbitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Bitwise AND of two numbers");

        System.out.print("Enter the first Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();

        
        int result = num1 & num2; 

        System.out.println("The result of bitwise operator is : " + result);
    }
}
