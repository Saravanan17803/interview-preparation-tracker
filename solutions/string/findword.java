import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class findword {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        System.out.println("Enter the character to search for:");
        char x = scanner.next().charAt(0);
        findword solution = new findword();
        List<Integer> result = solution.findWordsContaining(words, x);
        System.out.println("Indices of words containing '" + x + "': " + result);
    }
}
