import java.util.Scanner;

public class CubeSurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the cube: ");
        double side = sc.nextDouble();

        double surfaceArea = 6 * Math.pow(side, 2);
        System.out.println("Total Surface Area of the cube: " + surfaceArea);

        sc.close();
    }
}
