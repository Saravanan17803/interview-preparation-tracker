import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the parallelogram: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the parallelogram: ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the parallelogram: " + perimeter);

        sc.close();
    }
}
