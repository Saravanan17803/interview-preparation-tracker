import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("Digit.");
        } else if (Character.isAlphabetic(ch)) {
            System.out.println("Alphabet.");
        } else {
            System.out.println("Special character.");
        }

        sc.close();
    }
}
