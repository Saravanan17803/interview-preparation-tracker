import java.util.Scanner;

class shufffleString  {
    public String restoreString(String s, int[] indices) {
        char[] shuffle = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffle[indices[i]] = s.charAt(i);
        }
        return new String(shuffle);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string s: ");
        String s = scanner.nextLine();
        System.out.print("Enter the size of indices array: ");
        int n = scanner.nextInt();
        int[] indices = new int[n];
        
        System.out.println("Enter the indices:");
        for (int i = 0; i < n; i++) {
            indices[i] = scanner.nextInt();
        }
        shufffleString  solution = new shufffleString ();
        String result = solution.restoreString(s, indices);
        System.out.println("The shuffled string is: " + result);
        
        scanner.close();
    }
}
