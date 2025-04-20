import java.util.*;
public class perimeteroftriangle {
   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the value of A: ");
        int A=sc.nextInt();

        System.out.print("enter the value of B: ");
        int B=sc.nextInt();

        System.out.print("enter the value of C: ");
        int C=sc.nextInt();

        System.out.print("enter the value of D: ");
        int D=sc.nextInt();

        int perimeter = A + B + C + D;

        System.out.println("The Preimeter of Rectangle is : " + perimeter);
    }
}
