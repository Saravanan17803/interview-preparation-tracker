import java.util.Arrays;
import java.util.Scanner;

public class PermutationArray {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array (values must be between 0 and " + (n - 1) + "):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            while (nums[i] < 0 || nums[i] >= n) {
                System.out.println("Invalid input. Please enter a value between 0 and " + (n - 1) + ":");
                nums[i] = scanner.nextInt();
            }
        }

        int[] result = buildArray(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
