import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // first user value
        System.out.print("ENter the Value of a: ");
        int num1=sc.nextInt();
        
        // second user value
        System.out.print("Enter the value of b: ");
        int num2=sc.nextInt();

        // Add Two Numbers
        int sum=num1+num2;

        System.out.println("The Sum of Two Number is : "+sum);
    }
}