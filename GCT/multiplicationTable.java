
import java.util.Scanner;

public class multiplicationTable {

    public static void multiplicationofnumber(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++ ){
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        multiplicationofnumber();
    }
}
