
import java.util.Scanner;

public class LCM {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the first Number : ");
        int first = sc.nextInt();

        System.out.println("Enter the second Number : ");
        int second = sc.nextInt();

        int LCM = lcm(first, second);
        System.out.println("LCM of the two numbers is : " + LCM);
    }
    public static int lcm(int first, int second){
       
       int i = 1;
        while(true){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
