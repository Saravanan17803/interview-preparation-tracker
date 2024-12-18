import java.util.Scanner;

public class FibonacciSequence {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = sc.nextInt();

        generateFibonacci(n);
    }
}
