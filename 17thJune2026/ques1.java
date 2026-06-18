import java.io.*;
import java.util.*;

public class ques1 {

    static Stack<Integer> inputStack = new Stack<>();
    static Stack<Integer> outputStack = new Stack<>();

    // Add a request to the queue
    static void add(int floor) {
        inputStack.push(floor);
    }

    // Serve the oldest request
    static int next() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        if (outputStack.isEmpty()) {
            return -1;
        }

        return outputStack.pop();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < q; i++) {
            String line = br.readLine().trim();
            String[] operation = line.split("\\s+");

            if (operation[0].equals("ADD")) {
                int floor = Integer.parseInt(operation[1]);
                add(floor);
            } else if (operation[0].equals("NEXT")) {
                result.append(next()).append('\n');
            }
        }

        System.out.print(result);
    }
}