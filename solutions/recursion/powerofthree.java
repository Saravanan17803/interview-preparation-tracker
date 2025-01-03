public class powerofthree {
    public boolean isPowerOfThree(int n) {
     
        if(n==1)
            return true;
        if(n<=0||n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
    public static void main(String[] args) {
        int n=27;
        powerofthree power=new powerofthree();
        boolean bool=power.isPowerOfThree(n);
        System.out.println(bool);
    }
}
