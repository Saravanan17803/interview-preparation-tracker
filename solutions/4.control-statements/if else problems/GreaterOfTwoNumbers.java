import java.util.Scanner;

public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Greater number: " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}