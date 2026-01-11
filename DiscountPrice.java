import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double original = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double discountedPrice = original - (original * discount / 100);
        System.out.println("Discounted Selling Price = " + discountedPrice);
    }
}
