
import java.util.Arrays;
import java.util.Scanner;

class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Arrays.binarySearch(sorted, nums[i]);
        }
        return ans;  
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmallerThanCurrent solution = new SmallerThanCurrent();
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = solution.smallerNumbersThanCurrent(nums);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
