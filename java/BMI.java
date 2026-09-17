import java.util.*;

public class BMI {
    public static double formular (double h, double w) {
        double result = w / (h * h);
        return result;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, weight;
        System.out.println("Tinh BMI:");
        System.out.print("Chieu cao: ");
        height = sc.nextDouble();
        System.out.print("Can nang: ");
        weight = sc.nextDouble();
        System.out.println(formular(height,weight));
    }
}