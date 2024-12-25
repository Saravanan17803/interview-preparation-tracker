
import java.util.Scanner;

class finalvalue {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                x++;
            } else if (op.equals("--X") || op.equals("X--")) {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of operations:");
        int n = scanner.nextInt();
        scanner.nextLine();  
        
        String[] operations = new String[n];
        System.out.println("Enter the operations:");
        for (int i = 0; i < n; i++) {
            operations[i] = scanner.nextLine();
        }

        finalvalue solution = new finalvalue();
        int result = solution.finalValueAfterOperations(operations);
        System.out.println("Final value of x: " + result);
        
        scanner.close();
    }
}
