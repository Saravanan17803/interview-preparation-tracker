
class reversestring {
    public void reverseString(char[] s) {
        reverseHelper(s, 0, s.length - 1);
    }

    private void reverseHelper(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverseHelper(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        reversestring solution = new reversestring();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        System.out.println(s);
    }
}
