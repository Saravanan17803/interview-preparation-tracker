import java.util.Scanner;

class minimumcost {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(evenCount, oddCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chips: ");
        int n = sc.nextInt();
        int[] position = new int[n];
        System.out.println("Enter the positions of the chips: ");
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextInt();
        }
        minimumcost solution = new minimumcost();
        int cost = solution.minCostToMoveChips(position);
        System.out.println("The minimum cost to move all chips to the same position is: " + cost);
        sc.close();
    }
}
