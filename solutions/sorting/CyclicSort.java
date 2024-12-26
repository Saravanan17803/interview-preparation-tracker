import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of elements: "); 
        int n = scanner.nextInt(); 

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (1 to n): ");
        for (int i = 0; i < n; i++) { 
            arr[i] = scanner.nextInt(); 
        }

        cyclicSort(arr); 

        System.out.println("Sorted array: "); 
        printArray(arr); 
    }

    static void cyclicSort(int[] arr) {
        int i = 0; 
        while (i < arr.length) { 
            int correctIndex = arr[i] - 1; 
            if (arr[i] != arr[correctIndex]) { 
                int temp = arr[i]; 
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp; 
            } else {
                i++; 
            }
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); 
    }
}
