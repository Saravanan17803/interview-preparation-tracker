import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayform {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        int i = n - 1;

        while (i >= 0 || k > 0 || carry > 0) {
            int digit = (i >= 0 ? num[i] : 0) + (k % 10) + carry;
            carry = digit / 10;
            result.add(0, digit % 10);
            k /= 10;
            i--;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the num array: ");
        int size = scanner.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the elements of the num array:");
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        arrayform solution = new arrayform();
        List<Integer> result = solution.addToArrayForm(num, k);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
