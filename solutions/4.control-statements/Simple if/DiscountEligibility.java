import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your total purchase amount: ");
        double amount = sc.nextDouble();

        if (amount > 500) {
            System.out.println("You are eligible for a discount.");
        }

        sc.close();
    }
}
