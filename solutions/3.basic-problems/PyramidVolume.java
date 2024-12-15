import java.util.Scanner;

public class PyramidVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base area of the pyramid: ");
        double baseArea = sc.nextDouble();

        System.out.print("Enter the height of the pyramid: ");
        double height = sc.nextDouble();

        double volume = (1.0 / 3) * baseArea * height;
        System.out.println("Volume of the pyramid: " + volume);

        sc.close();
    }
}
