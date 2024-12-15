import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current temperature: ");
        int temp = sc.nextInt();

        if (temp > 30) {
            System.out.println("It's hot outside.");
        }

        sc.close();
    }
}
