public class linearsearch {
    public static int linearSearch(int[] arr, int key, int i) {
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return linearSearch(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 30;

        int result = linearSearch(arr, key, 0);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}