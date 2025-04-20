
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the Number : ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Your number is Prime");
        }else{
            System.out.println("Your number is not Prime");
        }
    }

    public static boolean isPrime(int num){
        int i = 2; 
        while( i<num){
            if(num % i ==0){
                return false;
            }   
            i++;
        }
        return true;
    }
}

