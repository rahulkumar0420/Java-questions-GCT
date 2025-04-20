import java.util.Scanner;

public class OddEvenBItwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Number is even or odd using bitwise operators\n");

        System.out.print("Enter the  Number : ");
        int num1 = sc.nextInt();

        if((num1 & 1) == 1){
            System.out.println("Number  is Odd");
        }else{
            System.out.println(" Number is Even");
        }
        
    }
}
