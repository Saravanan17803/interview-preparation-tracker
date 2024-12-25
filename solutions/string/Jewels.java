import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Jewels {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the jewels (types of stones that are jewels):");
        String jewels = scanner.nextLine();

        System.out.println("Enter the stones (types of stones you have):");
        String stones = scanner.nextLine();
        Jewels solution = new Jewels();
        int result = solution.numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result);

        scanner.close();
    }
}
