import java.util.Scanner;

class CeilFloor {
    public int[] search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int floor = -1, ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return new int[]{target, target};
            } else if (nums[mid] < target) {
                floor = nums[mid];
                left = mid + 1;
            } else {
                ceil = nums[mid];
                right = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CeilFloor solution = new CeilFloor();

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        int[] result = solution.search(nums, target);
        
        if (result[0] == target && result[1] == target) {
            System.out.println("Target found: " + target);
        } else {
            System.out.println("Floor of target: " + (result[0] != -1 ? result[0] : "None"));
            System.out.println("Ceil of target: " + (result[1] != -1 ? result[1] : "None"));
        }

        sc.close();
    }
}
