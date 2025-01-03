public class poweroftwo {
    public boolean isPowerOfTwo(int n) {
     
        if(n==1)
            return true;
        if(n<=0||n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args) {
        int n=4;
        poweroftwo power=new poweroftwo();
        boolean bool=power.isPowerOfTwo(n);
        System.out.println(bool);
    }
}
