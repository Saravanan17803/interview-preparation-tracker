
public class spiral3{

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int count = 0; 
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int step = 1; 
        int dirIndex = 0;
        result[count++] = new int[]{rStart, cStart};
        while (count < rows * cols) {
            for (int d = 0; d < 2; d++) { 
                for (int i = 0; i < step; i++) {
                    rStart += directions[dirIndex][0];
                    cStart += directions[dirIndex][1];
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        result[count++] = new int[]{rStart, cStart};
                        if (count == rows * cols) {
                            return result;
                        }
                    }
                }
                dirIndex = (dirIndex + 1) % 4;
            }
            step++;
        }

        return result; 
    }

    public static void main(String[] args) {
        spiral3 solution = new spiral3();
        
        // Test case 1
        int rows1 = 1;
        int cols1 = 4;
        int rStart1 = 0;
        int cStart1 = 0;
        int[][] result1 = solution.spiralMatrixIII(rows1, cols1, rStart1, cStart1);
        System.out.println("Test case 1:");
        for (int[] point : result1) {
            System.out.println("[" + point[0] + ", " + point[1] + "]");
        }

        // Test case 2
        int rows2 = 5;
        int cols2 = 6;
        int rStart2 = 1;
        int cStart2 = 4;
        int[][] result2 = solution.spiralMatrixIII(rows2, cols2, rStart2, cStart2);
        System.out.println("\nTest case 2:");
        for (int[] point : result2) {
            System.out.println("[" + point[0] + ", " + point[1] + "]");
        }
    }
}
