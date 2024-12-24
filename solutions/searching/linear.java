import java.util.Scanner;
public class linear {
    public static void search(int[] nums,int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                System.out.println("Element found " + nums[i]);
                break;
            }
            
        }      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        search(nums,key);
        
}
}
