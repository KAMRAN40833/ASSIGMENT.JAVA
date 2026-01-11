import java.util.Scanner;

public class OriginalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter discounted price: ");
        double discounted = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double original = discounted / (1 - discount / 100);
        System.out.println("Original Selling Price = " + original);
    }
}
