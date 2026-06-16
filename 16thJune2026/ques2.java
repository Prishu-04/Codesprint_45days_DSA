import java.io.*;
import java.util.*;

public class ques2 {

    static int evaluatePrefix(String expression) {
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse from right to left
        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            // Ignore spaces, if any
            if (ch == ' ') {
                continue;
            }

            // Operand
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            // Operator
            else {
                int first = stack.pop();
                int second = stack.pop();

                int result = 0;

                switch (ch) {
                    case '+':
                        result = first + second;
                        break;

                    case '-':
                        result = first - second;
                        break;

                    case '*':
                        result = first * second;
                        break;

                    case '/':
                        result = first / second; // Integer division
                        break;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine().trim();

        System.out.println(evaluatePrefix(expression));
    }
}