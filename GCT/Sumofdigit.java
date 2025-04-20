
import java.util.Scanner;

public class Sumofdigit {
    public static int sumofDigit(int num){
       int sum = 0;
       while(num > 0){
        sum +=num % 10;
        num = num/10;
       }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Digit : ");
        int num = sc.nextInt();
        
        int sum = sumofDigit(num);

        System.out.print("The Sum of Digit is : " + sum );
    }
}
