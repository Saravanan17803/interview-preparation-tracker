
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Time (T) in years: ");
        double time = sc.nextDouble();

        System.out.print("Enter the Rate of Interest (R) in percentage: ");
        double rate = sc.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
        sc.close();
    }
}
