import java.util.Scanner;

public class MinimumBalanceWarning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bank account balance: ");
        double balance = sc.nextDouble();

        if (balance < 100) {
            System.out.println("Warning: Low balance.");
        }

        sc.close();
    }
}
