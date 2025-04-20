
import java.util.Scanner;

public class Oddsum {

    public static int Oddsum(int num){
        int sum = 0;
        int i = 1;
        while(i<= num){
            sum += i;
            i +=2;
        }    
        return sum;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Number : ");
        int num = sc.nextInt();
        int sum = Oddsum(num);

        System.out.print("OddSum till " + num + " is : " + sum);

    }   
    
}
