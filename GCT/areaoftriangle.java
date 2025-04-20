
import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Base of Triangle : ");
        int b=sc.nextInt();

        System.out.print("Enter the Height of Triangle : ");
        int h=sc.nextInt();

        // 
        double Area = (b*h)/2;

        System.out.println("The Area of Triangle is : " + Area + "Cm2");
    }
}
