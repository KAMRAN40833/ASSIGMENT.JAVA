import java.util.Scanner;

public class PercentageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double obtained = sc.nextDouble();

        System.out.print("Enter maximum marks: ");
        double maximum = sc.nextDouble();

        double percentage = (obtained / maximum) * 100;
        System.out.println("Percentage = " + percentage + "%");
    }
}
