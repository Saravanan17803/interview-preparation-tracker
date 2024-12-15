import java.util.Scanner;

public class IsoscelesTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the isosceles triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the isosceles triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of the isosceles triangle: " + area);

        sc.close();
    }
}
