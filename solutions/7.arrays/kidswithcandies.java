
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kidswithcandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of kids: ");
        int n = scanner.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the candies for each kid:");
        for (int i = 0; i < n; i++) {
            System.out.print("Kid " + (i + 1) + ": ");
            candies[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of extra candies: ");
        int extraCandies = scanner.nextInt();
        kidswithcandies solution = new kidswithcandies();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println("Results:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Kid " + (i + 1) + ": " + result.get(i));
        }

        scanner.close();
    }
}
