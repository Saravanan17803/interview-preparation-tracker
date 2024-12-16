import java.util.Scanner;
class NumberPatterns {

    public static void numberPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void numberPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void numberPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void numberPattern4(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void numberPattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }

    public static void numberPattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void numberPattern7(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int minDist = Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j));
                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }
    }
    public static void numberPattern8(int n) {
        int num = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num++ + " ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
    public static void numberPattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void numberPattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines (n): ");
        int n = sc.nextInt();

        System.out.println("Choose a pattern number (1-10): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: numberPattern1(n); break;
            case 2: numberPattern2(n); break;
            case 3: numberPattern3(n); break;
            case 4: numberPattern4(n); break;
            case 5: numberPattern5(n); break;
            case 6: numberPattern6(n); break;
            case 7: numberPattern7(n); break;
            case 8: numberPattern8(n); break;
            case 9: numberPattern9(n); break;
            case 10: numberPattern10(n); break;
            default: System.out.println("Invalid choice. Please select a valid pattern number.");
        }

        sc.close();
    }
}
