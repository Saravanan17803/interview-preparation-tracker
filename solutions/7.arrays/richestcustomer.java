import java.util.Scanner;

class richestcustomer {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of banks: ");
        int n = scanner.nextInt();

        int[][] accounts = new int[m][n];
        System.out.println("Enter the wealth for each customer and bank:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Customer " + (i + 1) + ", Bank " + (j + 1) + ": ");
                accounts[i][j] = scanner.nextInt();
            }
        }
        richestcustomer solution = new richestcustomer();
        int result = solution.maximumWealth(accounts);
        System.out.println("The maximum wealth is: " + result);

        scanner.close();
    }
}
