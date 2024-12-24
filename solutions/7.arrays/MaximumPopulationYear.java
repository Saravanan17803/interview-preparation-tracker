import java.util.Scanner;

class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] change = new int[2051];
        for (int[] log : logs) {
            change[log[0]]++;
            change[log[1]]--; 
        }

        int max = 0, year = 1950, currentPopulation = 0;
        for (int i = 1950; i < 2051; i++) {
            currentPopulation += change[i];
            if (currentPopulation > max) {
                max = currentPopulation;
                year = i;
            }
        }

        return year;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of logs:");
        int n = scanner.nextInt();
        int[][] logs = new int[n][2];

        System.out.println("Enter the birth and death years for each log:");
        for (int i = 0; i < n; i++) {
            logs[i][0] = scanner.nextInt();
            logs[i][1] = scanner.nextInt(); 
        }
        MaximumPopulationYear solution = new MaximumPopulationYear();
        int result = solution.maximumPopulation(logs);

        System.out.println("The earliest year with the maximum population is: " + result);

        scanner.close();
    }
}
