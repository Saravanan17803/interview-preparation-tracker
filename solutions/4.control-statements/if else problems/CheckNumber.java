import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive number.");
        } else if (num < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}