import java.util.*;

public class combinationsum1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, current, ans);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of candidates:");
        int n = sc.nextInt();
        int[] candidates = new int[n];
        System.out.println("Enter the candidates:");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        combinationsum1 solution = new combinationsum1();
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Combinations that sum to target:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }

        sc.close();
    }
}
