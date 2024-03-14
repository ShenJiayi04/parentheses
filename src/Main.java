import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression(only parentheses): ");
        String expression = scanner.nextLine();
        scanner.close();

        if (BalancedParentheses.checkBalancedParentheses(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}