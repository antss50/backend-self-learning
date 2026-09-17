import java.util.*;

public class DiscountProduct {
    public static double discount(double price, double percentage) {
        return price - price * percentage / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, percentage;
        System.out.print("Enter the price of the product: ");
        price = sc.nextDouble();
        System.out.print("Enter the discount percentage of the product: ");
        percentage = sc.nextDouble();
        System.out.print("Final price: " + discount(price, percentage));
    }
}