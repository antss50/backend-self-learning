import java.util.*;

public class Main {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do °C: ");
        celsius = sc.nextDouble();
        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Chuyen doi sang do °F: " + fahrenheit);
        celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Chuyen doi sang do °C: " + celsius);
    }
}