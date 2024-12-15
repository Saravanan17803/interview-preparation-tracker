import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the diagonals of the rhombus: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        double area = 0.5 * d1 * d2;
        System.out.println("Area of the rhombus: " + area);

        sc.close();
    }
}
