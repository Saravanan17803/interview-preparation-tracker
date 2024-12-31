
import java.util.Scanner;

public class Kmissingnumber {
        public int findKthPositive(int[] arr, int k) {
            int left=0;
            int right=arr.length-1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int missing=arr[mid]-(mid+1);
                if (k > missing) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return k+right+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Kmissingnumber km=new Kmissingnumber();
        int result=km.findKthPositive(nums,k);
        System.out.println(result);
    }
}
