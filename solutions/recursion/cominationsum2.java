import java.util.*;

public class cominationsum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, current, result);
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

        cominationsum2 solution = new cominationsum2();
        List<List<Integer>> result = solution.combinationSum2(candidates, target);

        System.out.println("Combinations that sum to target:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }

        sc.close();
    }
}
