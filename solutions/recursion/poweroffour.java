public class poweroffour {
    public boolean isPowerOfFour(int n) {
     
        if(n==1)
            return true;
        if(n<=0||n%2!=0){
            return false;
        }
        return isPowerOfFour(n/2);
    }
    public static void main(String[] args) {
        int n=64;
        poweroffour power=new poweroffour();
        boolean bool=power.isPowerOfFour(n);
        System.out.println(bool);
    }
}
