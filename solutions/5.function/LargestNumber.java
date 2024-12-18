import java.util.Scanner;

public class LargestNumber {
    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
    }
}
