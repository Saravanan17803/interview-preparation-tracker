import java.util.Scanner;

class numberofgoodpairs {
    public int numIdenticalPairs(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    len++;
                }
            }
        }
        
        return len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberofgoodpairs solution = new numberofgoodpairs();
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = solution.numIdenticalPairs(nums);
        System.out.println("Number of good pairs: " + result);
    }
}
