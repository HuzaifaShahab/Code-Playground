import java.util.Stack;

public class parenthesisOrderChecking {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();         // {[()]}

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // Unmatched closing bracket or invalid character
            }
        }

        return stack.isEmpty(); // All opened parentheses were successfully closed
    }

    public static void main(String[] args) {
        String input = "{[()}";
        boolean result = isBalanced(input);

        if (result) {
            System.out.println("The parentheses are balanced and closed successfully.");
        } else {
            System.out.println("The parentheses are not balanced or closed successfully.");
        }
    }
}