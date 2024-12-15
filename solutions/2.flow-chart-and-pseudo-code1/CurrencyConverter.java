import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees: ");
        double rupees = sc.nextDouble();
        double conversionRate = 80.0;
        double usd = rupees / conversionRate;
        System.out.println("The amount in USD is: " + " $" + usd);
        sc.close();
    }
}
