public class sumofdigit {
    
    public static void main(String[] args) {
        int num=12345;
        int result=sumofdigit(num);
        System.out.println(result);
    }
    public static int sumofdigit(int num){
        if(num==0)
            return 0;
        return (num % 10 + sumofdigit(num / 10));
    }
}
