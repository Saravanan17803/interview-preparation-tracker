import java.util.Scanner;

class ipadress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid IPv4 address:");
        String address = scanner.nextLine();
        ipadress solution = new ipadress();
        String result = solution.defangIPaddr(address);
        System.out.println("Defanged IP address: " + result);

        scanner.close();
    }
}
