import java.util.Scanner;

public class UppercaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("The character is uppercase.");
        }

        sc.close();
    }
}
