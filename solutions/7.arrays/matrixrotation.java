
public class matrixrotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) {
                return true; 
            }
            mat = rotate90(mat);
        }
        return false; 
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true; 
    }

    private int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j]; 
            }
        }
        return rotated; 
    }
    public static void main(String[] args) {
        matrixrotation solution = new matrixrotation();
        
        // Test case 1
        int[][] mat1 = {{0, 1}, {1, 0}};
        int[][] target1 = {{1, 0}, {0, 1}};
        System.out.println(solution.findRotation(mat1, target1)); // Should return true

        // Test case 2
        int[][] mat2 = {{0, 1}, {1, 1}};
        int[][] target2 = {{1, 0}, {0, 1}};
        System.out.println(solution.findRotation(mat2, target2)); // Should return false

        // Test case 3
        int[][] mat3 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target3 = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(solution.findRotation(mat3, target3)); // Should return true
    }
}
