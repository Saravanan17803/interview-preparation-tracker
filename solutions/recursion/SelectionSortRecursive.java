import java.util.Scanner;

public class SelectionSortRecursive {
    public static void selectionSort(int[] arr, int start, int n) {
        if (start >= n - 1) {
            return;
        }
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[start];
        arr[start] = temp;
        selectionSort(arr, start + 1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        selectionSort(arr, 0, n);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
