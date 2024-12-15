import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        float Area=(1/2)*base*height;
        System.out.println(Area);
        sc.close();
    }
}