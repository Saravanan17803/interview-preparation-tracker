public class printnumber {
    public static void main(String[] args) {
        a(5);
    }

    public static void a(int n) {
        if(n==0){
            return;
        }
        
        System.out.println(n);
        a(n-1);
    }
}
