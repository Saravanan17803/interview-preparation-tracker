
class gfg {
    public static void main(String[] args) {
        int T=1;
            int A = 1;
            int B = 2;
            int C = 3;
            int N = 5;
            
            System.out.println(geekOnacci(A, B, C, N));
        
    }
    
    private static int geekOnacci(int A, int B, int C, int N) {
        if (N == 1) return A;
        if (N == 2) return B;
        if (N == 3) return C;
        return geekOnacci(A, B, C, N - 1) + geekOnacci(A, B, C, N - 2) + geekOnacci(A, B, C, N - 3);
    }
}