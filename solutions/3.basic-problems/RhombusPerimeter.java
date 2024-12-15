import java.util.Scanner;

public class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the rhombus: ");
        double side = sc.nextDouble();

        double perimeter = 4 * side;
        System.out.println("Perimeter of the rhombus: " + perimeter);

        sc.close();
    }
}
