import java.util.Scanner;

class sumofarray {
    public int[] sumOfArray(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];  // First element is the same as nums[0]

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];  // Add the current number to the running sum
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sumofarray solution = new sumofarray();
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = solution.sumOfArray(nums);
        System.out.println("Running sum: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
