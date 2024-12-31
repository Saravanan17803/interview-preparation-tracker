public class recursion {
    public static void main(String[] args) {
        a(5);
    }

    public static void a(int n) {
        if(n==0){
            return;
        }
        a(n-1);
        System.out.println(n);
    }

}
