import java.util.Stack;

public class BalancedParentheses {

    
    public static boolean checkBalancedParentheses(String expression) {

        Stack<Character> stack = new Stack<>();
        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char close = stack.pop();
                if ((bracket == ')' && close != '(') || (bracket == ']' && close != '[') || (bracket == '}' && close != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}