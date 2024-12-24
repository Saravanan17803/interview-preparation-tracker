import java.util.Scanner;
public class highestaltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            max = Math.max(max, altitude);
        }
        
        return max;
    }
    public static void main(String[] args) {
        highestaltitude ha = new highestaltitude();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of Element in Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Element in Array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Highest altitude: " + ha.largestAltitude(arr)); // Output: 0
    }
}
