import java.util.Scanner;

 class factorial {

    public static long factorial(int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i<=num){
            fact = fact*i;
            i++;
            
        }
        return fact;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Plz Enter your NUmber : ");
       int num = sc.nextInt();
    long fact = factorial( num);
       System.out.print("Factorial is : " + fact);
   
   }
}
