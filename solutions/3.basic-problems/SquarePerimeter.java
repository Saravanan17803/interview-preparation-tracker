import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        double perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);

        sc.close();
    }
}
