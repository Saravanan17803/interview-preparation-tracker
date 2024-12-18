import java.util.Scanner;
import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidParentheses solution = new ValidParentheses();
        
        System.out.println("Enter a string containing brackets:");
        String input = scanner.nextLine();
        boolean result = solution.isValid(input);
        if (result) {
            System.out.println("The input string is valid.");
        } else {
            System.out.println("The input string is invalid.");
        }
        scanner.close();
    }
}
