import java.util.Arrays;
import java.util.Scanner;
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        nums = buildArray(nums);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
