import java.util.Scanner;

public class PointQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        float x = sc.nextFloat();

        System.out.print("Enter y coordinate: ");
        float y = sc.nextFloat();

        if (x > 0 && y > 0) {
            System.out.println("First quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("Second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("Third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth quadrant.");
        } else {
            System.out.println("Point is on the axis.");
        }

        sc.close();
    }
}
