
import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Temperature in Farenheight: ");
        int F= sc.nextInt();

        System.out.print("Enter the temperature in Celcious :");
        float C = sc.nextFloat();

        double Celcioustofarenheit = (C * 9/5) + 32;
        double farenheittocelcious = (F - 32)* 5/9;

        System.out.println("convert farenheit to is:" + farenheittocelcious);
        System.out.println("convert Celsius to Fahrenheit is:" + Celcioustofarenheit);

    }
}
