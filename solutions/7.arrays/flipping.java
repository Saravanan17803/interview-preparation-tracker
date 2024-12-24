
import java.util.Scanner;

public class flipping {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int start = 0, end = image[i].length - 1;
            while (start <= end) {
                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] image = new int[n][n];
        System.out.println("Enter the binary matrix elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                image[i][j] = scanner.nextInt();
            }
        }
        flipping solution = new flipping();
        int[][] result = solution.flipAndInvertImage(image);
        System.out.println("The flipped and inverted image is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
