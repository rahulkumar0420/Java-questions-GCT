
import java.util.Scanner;

public class gradecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks : ");
        int marks = sc.nextInt();
        
        if(marks >=90){
            System.out.println("Grade A");
        }else if(marks >=75){
            System.out.println("Grade B");
        }else if(marks >=60){
            System.out.println("Grade C");
        }else if(marks >=30){
            System.out.println("Grade D");
        }else if(marks < 80){
            System.out.println("Grade F");
        }
    }
}
