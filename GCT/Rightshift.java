import java.util.Scanner;

public class Rightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "  Bitwise  Right shift operator\n");

        System.out.print("Enter the  Number : ");
        int num1 = sc.nextInt();

    
        int result =  num1 >> 2; 

        System.out.println("The result of  Right shift Bitwise Operator is : " + result);
    }
}

