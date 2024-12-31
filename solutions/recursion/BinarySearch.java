public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key < arr[mid]) {
            return binarySearch(arr, key, low, mid - 1);
        } else {
            return binarySearch(arr, key, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 30;

        int result = binarySearch(arr, key, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
