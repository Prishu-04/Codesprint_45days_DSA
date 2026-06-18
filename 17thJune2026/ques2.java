import java.io.*;
import java.util.*;

public class ques2 {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    // Push a stress level
    static void push(int value) {
        stack.push(value);

        // Store value if it is smaller than or equal to current minimum
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Remove the most recently added stress level
    static void pop() {
        if (stack.isEmpty()) {
            return;
        }

        int removed = stack.pop();

        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Return current minimum stress level
    static int getMinimum() {
        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.peek();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < q; i++) {

            String line = br.readLine().trim();
            String[] operation = line.split("\\s+");

            if (operation[0].equals("PUSH")) {

                int value = Integer.parseInt(operation[1]);
                push(value);

            } else if (operation[0].equals("POP")) {

                pop();

            } else if (operation[0].equals("MIN")) {

                output.append(getMinimum()).append('\n');
            }
        }

        System.out.print(output);
    }
}