import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cone: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cone: ");
        double height = sc.nextDouble();

        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of the cone: " + volume);

        sc.close();
    }
}
