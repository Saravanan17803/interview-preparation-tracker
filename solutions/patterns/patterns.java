import java.util.Scanner;

public class patterns {

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) System.out.print(" ");
            for (int j = 0; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 1; j <= n - i + 1; j++) {
                if (j == 1 || j == n - i + 1 || i == 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--) System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < n - i; j++) System.out.print("*");
            for (int j = 0; j < n - i; j++) System.out.print(" ");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) System.out.print(" ");
            for (int j = 0; j <= i; j++) System.out.print("*");
            for (int j = 0; j <= i; j++) System.out.print(" ");
            System.out.println();
        }
    }

    

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) System.out.print(" ");
    
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        int spaces = n - 1;
        int innerSpaces = -1; 
    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) System.out.print(" ");
            System.out.print("*");
            if (innerSpaces > 0) {
                for (int j = 1; j <= innerSpaces; j++) System.out.print(" ");
                System.out.print("*");
            }
    
            System.out.println();
            spaces--;        
            innerSpaces += 2; 
        }
    }
    
    

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for patterns:");
        int n = sc.nextInt();

        System.out.println("\nPattern 1:");
        pattern1(n);

        System.out.println("\nPattern 2:");
        pattern2(n);

        System.out.println("\nPattern 3:");
        pattern3(n);

        System.out.println("\nPattern 4:");
        pattern4(n);

        System.out.println("\nPattern 5:");
        pattern5(n);

        System.out.println("\nPattern 6:");
        pattern6(n);

        System.out.println("\nPattern 7:");
        pattern7(n);

        System.out.println("\nPattern 8:");
        pattern8(n);

        System.out.println("\nPattern 9:");
        pattern9(n);
        sc.close();
    }
}
