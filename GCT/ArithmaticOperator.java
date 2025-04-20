
import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int num1=sc.nextInt();

        System.out.print("Enter the value of b: ");
        int num2=sc.nextInt();

        // Additon of two number
        int Sum = num1 + num2;
        System.out.println("The addition of two number is : " + Sum);

        // Substraction  of two number
        int Sub = num1 - num2;
        System.out.println("The Substraction of two number is : " + Sub);    
        
        // The Multiplication of two number
        int Mul = num1 * num2;
        System.out.println("The Multiplication of two number is : " + Mul);
        
        // The Division of two number 
        int Div = num1 / num2;
        System.out.println("The Division of two number is : " + Div);

        // The Remainder of two number
        int Rem = num2 % num1;
        System.out.println("The Remainder of two number is : " + Rem);
    }
}
