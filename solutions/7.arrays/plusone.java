import java.util.Arrays;
import java.util.Scanner;

public class plusone {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ans = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  
                return digits; 
            }
            digits[i] = 0; 
        }
        ans[0] = 1; 
        return ans;   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n = scanner.nextInt();
        int[] digits = new int[n];

        System.out.println("Enter the digits of the number:");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }
        plusone  solution = new plusone ();
        int[] result = solution.plusOne(digits);

        // Output the result
        System.out.println("Result after adding 1: " + Arrays.toString(result));

        // Close the scanner
        scanner.close();
    }
}
