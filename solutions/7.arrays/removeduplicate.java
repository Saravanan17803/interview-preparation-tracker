
import java.util.Scanner;

class removeduplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; 
        }

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++; 
            }
        }

        return i; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the sorted array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        removeduplicate solution = new removeduplicate();
        int k = solution.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.println("Array with unique elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}


