
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Principle Amount: ");
        int principle = sc.nextInt();

        System.out.print("Enter The Years : ");
        float years = sc.nextFloat();

        System.out.print("Enter the Rate of Interest : ");
        float rate = sc.nextFloat();

        float simpleInterest = (principle * rate * years)/100;

        System.out.println("Simple Interest is :  " + simpleInterest);
    }
}
