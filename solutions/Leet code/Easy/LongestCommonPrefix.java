import java.util.*;
class LongestCommonPrefix { // Corrected class name
    public String longest(String[] strs) { // Renamed function to 'longest'
        if (strs == null || strs.length == 0) {
            return "";
        }
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;
            while (j < temp.length() && j < current.length() && temp.charAt(j) == current.charAt(j)) {
                j++;
            }
            temp = temp.substring(0, j);
            if (temp.isEmpty()) {
                return "";
            }
        }
        return temp;
    }



    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of strings
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Input the strings
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        // Find and print the longest common prefix
        String result = solution.longest(strs);
        System.out.println("The longest common prefix is: \"" + result + "\"");

        scanner.close();
    }
}

