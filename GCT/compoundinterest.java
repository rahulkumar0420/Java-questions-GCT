
import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Principle Amount: ");
        int principle = sc.nextInt();

        System.out.print("Enter The Years : ");
        float time = sc.nextFloat();

        System.out.print("Enter the Rate of Interest : ");
        float rate = sc.nextFloat();

        double compoundInterest = principle * Math.pow(1 + rate / 100, time) - principle;

        System.out.println("The compound interest is : " + compoundInterest);
    }
}
