import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of elements: "); 
        int n = scanner.nextInt(); 

        int[] arr = new int[n]; 

        System.out.println("Enter the elements of the array: "); 
        for (int i = 0; i < n; i++) { 
            arr[i] = scanner.nextInt(); 
        }

        countingSort(arr); 

        System.out.println("Sorted array: "); 
        printArray(arr); 
    }

    static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        int[] count = new int[max + 1];

        for (int value : arr) {
            count[value]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
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
