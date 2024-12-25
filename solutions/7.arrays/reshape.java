import java.util.Scanner;

public class reshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat; 
        }
        int[][] reshaped = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshaped[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return reshaped;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        reshape solution = new reshape();

        System.out.print("Enter the number of rows in the matrix: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the number of rows for the reshaped matrix: ");
        int r = scanner.nextInt();
        System.out.print("Enter the number of columns for the reshaped matrix: ");
        int c = scanner.nextInt();

        int[][] reshaped = solution.matrixReshape(mat, r, c);
        System.out.println("Reshaped matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(reshaped[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
