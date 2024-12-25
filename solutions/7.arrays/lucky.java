import java.util.ArrayList;
import java.util.List;

public class lucky {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;  
        int n = matrix[0].length;
        int[] rowMins = new int[m];
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rowMins[i] = min;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMins[i]) {
                    boolean isMaxInCol = true;
                    for (int k = 0; k < m; k++) {
                        if (matrix[k][j] > matrix[i][j]) {
                            isMaxInCol = false;
                            break;
                        }
                    }
                    if (isMaxInCol) {
                        result.add(matrix[i][j]);
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        
        int[][] matrix1 = {{3,7,8},{9,11,13},{15,16,17}};
        lucky solution = new lucky();
        List<Integer> luckyNumbers1 = solution.luckyNumbers(matrix1);
        System.out.println("Lucky Numbers in Matrix 1: " + luckyNumbers1); 

        int[][] matrix2 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> luckyNumbers2 = solution.luckyNumbers(matrix2);
        System.out.println("Lucky Numbers in Matrix 2: " + luckyNumbers2);

        int[][] matrix3 = {{7,8},{1,2}};
        List<Integer> luckyNumbers3 = solution.luckyNumbers(matrix3);
        System.out.println("Lucky Numbers in Matrix 3: " + luckyNumbers3);
    }
}
