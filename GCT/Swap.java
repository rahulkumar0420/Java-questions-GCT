import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of a:");
        int a= sc.nextInt();

        System.out.print("Enter the value of b:");
        int b=sc.nextInt();

        System.out.println("Before Swapping ");
        System.out.println("The value of a is:" +a);
        System.out.println("The value of b is:" +b);

        int temp =a;
        a=b;
        b=temp;

        System.out.println("After Swapping");
        System.out.println("The value of a is:" +a);
        System.out.println("The value of b is:" +b);
    }
}