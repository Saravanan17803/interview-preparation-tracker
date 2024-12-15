import java.util.Scanner;

public class NumberRangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 10) {
            System.out.println("In range.");
        } else {
            System.out.println("Out of range.");
        }

        sc.close();
    }
}
