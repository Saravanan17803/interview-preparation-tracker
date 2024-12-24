import java.util.Scanner;
class NumberwithEven {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            } else {
                int digits = (int) Math.log10(num) + 1;
                if (digits % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberwithEven solution = new NumberwithEven();
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The count of numbers with an even number of digits is: " + solution.findNumbers(nums));
        sc.close();
    }
}
