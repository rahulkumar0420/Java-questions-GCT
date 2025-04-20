import java.util.Scanner;

public class welcomeName {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name=sc.nextLine();

        System.out.println( "Welcome You "  + name + " to Skill Development Training " );
    }
}
