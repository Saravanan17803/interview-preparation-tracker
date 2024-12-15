import java.util.Scanner;

public class EquilateralTrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();

        double perimeter = 3 * side;
        System.out.println("Perimeter of the equilateral triangle: " + perimeter);

        sc.close();
    }
}
