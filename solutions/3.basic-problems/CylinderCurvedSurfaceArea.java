import java.util.Scanner;

public class CylinderCurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        double surfaceArea = 2 * Math.PI * radius * height;
        System.out.println("Curved Surface Area of the cylinder: " + surfaceArea);

        sc.close();
    }
}
