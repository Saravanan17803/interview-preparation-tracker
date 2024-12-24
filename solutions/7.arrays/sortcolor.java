
import java.util.Scanner;

class sortcolor {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;      
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (only 0, 1, and 2 are allowed):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < 0 || nums[i] > 2) {
                System.out.println("Invalid input. Only 0, 1, or 2 are allowed.");
                return;
            }
        }
        sortcolor solution = new sortcolor();
        solution.sortColors(nums);
        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
