import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first parallel side: ");
        double a = sc.nextDouble();

        System.out.print("Enter second parallel side: ");
        double b = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double area = h * (a + b) / 2;
        System.out.println("Area of Trapezoid = " + area);
    }
}
