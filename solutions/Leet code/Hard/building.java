import java.util.*;
public class building {
    public static void main(String[] args) {
        int[] heights = {5, 3, 8, 2, 6, 1, 4, 6};
        int[][] queries = {
            {0, 7},
            {3, 5},
            {5, 2},
            {3, 0},
            {1, 6}
        };
        Solution solution = new Solution();
        int[] result = solution.leftmostBuildingQueries(heights, queries);
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] ans = new int[queries.length];      
        for (int q = 0; q < queries.length; q++) {
            int x = queries[q][0];
            int y = queries[q][1];
            if (x == y) {
                ans[q] = x;
                continue;
            }
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            if (heights[x] < heights[y]) {
                ans[q] = y;
                continue;
            }
            int leftmost = -1;
            for (int t = y + 1; t < heights.length; t++) {
                if (heights[x] < heights[t]) {
                    leftmost = t;
                    break;
                }
            }
            ans[q] = leftmost;
        }      
        return ans;
    }
}
