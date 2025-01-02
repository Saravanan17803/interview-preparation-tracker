
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combinationsum3 {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(k, n, 1, new ArrayList<>(), result);
            return result;
        }
    
        private void backtrack(int k, int n, int start, List<Integer> current, List<List<Integer>> result) {
            if (n == 0 && current.size() == k) {
                result.add(new ArrayList<>(current));
                return;
            }
            if (current.size() >= k || n < 0) {
                return;
            }
            for (int i = start; i <= 9; i++) {
                current.add(i);
                backtrack(k, n - i, i + 1, current, result);
                current.remove(current.size() - 1); 
            }
        }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of k (number of numbers):");
        int k = scanner.nextInt();

        System.out.println("Enter the value of n (target sum):");
        int n = scanner.nextInt();

        combinationsum3 solution = new combinationsum3();
        List<List<Integer>> result = solution.combinationSum3(k, n);

        System.out.println("Combinations are:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }

        scanner.close();
    }
}

