import java.util.Arrays;
import java.util.Scanner;
public class uniqueinteger {
        public int[] sumZero(int n) {
            int[] ans=new int[n];
            int index=0;
            for(int i=1;i<=n/2;i++){
                ans[index++]=i;
                ans[index++]=-i;
            }
                if(n%2!=0){
                    ans[index]=0;
                }
                return ans;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        uniqueinteger solution = new uniqueinteger();
        int[] result = solution.sumZero(n);
        System.out.println("Output: " + Arrays.toString(result));
        scanner.close();
        
    }
}
