
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the NUmber : ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println(" This is Even Number");
        }else{
            System.out.println("This is Odd Number");
        }
    }
}
