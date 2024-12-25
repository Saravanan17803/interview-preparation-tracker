import java.util.Scanner;

class equivalent_string {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings in word1: ");
        int n1 = scanner.nextInt();
        scanner.nextLine(); 
        String[] word1 = new String[n1];
        System.out.println("Enter the strings for word1:");
        for (int i = 0; i < n1; i++) {
            word1[i] = scanner.nextLine();
        }
        System.out.print("Enter the number of strings in word2: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();
        String[] word2 = new String[n2];
        System.out.println("Enter the strings for word2:");
        for (int i = 0; i < n2; i++) {
            word2[i] = scanner.nextLine();
        }
        equivalent_string solution = new equivalent_string();
        boolean result = solution.arrayStringsAreEqual(word1, word2);
        if (result) {
            System.out.println("The arrays represent the same string.");
        } else {
            System.out.println("The arrays do not represent the same string.");
        }

        scanner.close();
    }
}
