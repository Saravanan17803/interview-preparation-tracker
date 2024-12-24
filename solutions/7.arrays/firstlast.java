import java.util.Scanner;

class firstlast {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(nums, target, true);
        if (result[0] != -1) {
            result[1] = binarySearch(nums, target, false);
        }
        
        return result;
    }
    
    private int binarySearch(int[] nums, int target, boolean findLeft) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        firstlast solution = new firstlast();
        int[] result = solution.searchRange(nums, target);
        System.out.println("The result array is: [" + result[0] + ", " + result[1] + "]");
        
        sc.close();
    }
}
