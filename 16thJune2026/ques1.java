import java.io.*;
import java.util.*;

public class ques1 {

    // Returns the precedence of an operator
    static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }

        if (operator == '*' || operator == '/') {
            return 2;
        }

        return 0;
    }

    static String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            // Add operands directly to the postfix expression
            if (Character.isLetter(current)) {
                postfix.append(current);
            }

            // Push opening parenthesis onto the stack
            else if (current == '(') {
                stack.push(current);
            }

            // Pop until the matching opening parenthesis
            else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }

                // Remove '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // Current character is an operator
            else if (current == '+' || current == '-'
                    || current == '*' || current == '/') {

                /*
                 * All operators are left-associative.
                 * Therefore, operators with equal or higher precedence
                 * must be removed before pushing the current operator.
                 */
                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(stack.peek()) >= precedence(current)) {

                    postfix.append(stack.pop());
                }

                stack.push(current);
            }
        }

        // Add all remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine().trim();

        System.out.println(infixToPostfix(expression));
    }
}