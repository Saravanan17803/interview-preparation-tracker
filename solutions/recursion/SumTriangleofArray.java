
import java.util.*; 

public class SumTriangleofArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        triangle(nums);
    }
    public static void triangle(int[] nums){  
        if(nums.length<1)
            return;                              
        int[] arr=new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            arr[i]=nums[i]+nums[i+1];
        }
        triangle(arr);
        System.out.println(Arrays.toString(nums));
    }
}
