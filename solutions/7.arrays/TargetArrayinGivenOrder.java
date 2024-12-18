import java.util.ArrayList;
import java.util.Scanner;

public class TargetArrayinGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (index[i] > targetList.size()) {
                throw new IllegalArgumentException("Invalid index value at position " + i);
            }
            targetList.add(index[i], nums[i]);
        }

        int[] targetArray = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            targetArray[i] = targetList.get(i);
        }
        
        return targetArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter the elements of the nums array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int[] index = new int[n];
            System.out.println("Enter the elements of the index array:");
            for (int i = 0; i < n; i++) {
                index[i] = scanner.nextInt();
            }

            int[] targetArray = createTargetArray(nums, index);

            System.out.print("Target Array: ");
            for (int num : targetArray) {
                System.out.print(num + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
