import java.util.Scanner;

public class XORBitwise {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Bitwise XOR of two numbers \n");

        System.out.print("Enter the first Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();

        
        int result = num1 ^ num2; 

        System.out.println("The result of Bitwise Operator is : " + result);
    }
}


