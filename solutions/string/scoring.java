public class scoring {
    public int scoreOfString(String s) {
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            ans += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return ans;  
    }

    public static void main(String[] args) {
        scoring solution = new scoring();
        
        String s1 = "hello";
        System.out.println("Score of string '" + s1 + "': " + solution.scoreOfString(s1));

        String s2 = "zaz";
        System.out.println("Score of string '" + s2 + "': " + solution.scoreOfString(s2));
    }
}
