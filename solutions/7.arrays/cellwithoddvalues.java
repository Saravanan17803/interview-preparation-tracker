
import java.util.Scanner;

public class cellwithoddvalues {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }
        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 == 1) {
                    oddCount++;
                }
            }
        }
        
        return oddCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of indices: ");
        int k = scanner.nextInt();
        int[][] indices = new int[k][2];
        System.out.println("Enter the indices (each pair of row and column):");
        for (int i = 0; i < k; i++) {
            System.out.print("Enter row " + i + ": ");
            indices[i][0] = scanner.nextInt();
            System.out.print("Enter column " + i + ": ");
            indices[i][1] = scanner.nextInt();
        }
        cellwithoddvalues solution = new cellwithoddvalues();
        int result = solution.oddCells(m, n, indices);
        System.out.println("Number of odd cells: " + result);
        
        scanner.close();
    }
}
