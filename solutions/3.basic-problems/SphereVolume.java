import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();

        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the sphere: " + volume);

        sc.close();
    }
}