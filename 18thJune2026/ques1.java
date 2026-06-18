import java.io.*;
import java.util.*;

public class ques1 {

    static Stack<Integer> inputStack = new Stack<>();
    static Stack<Integer> outputStack = new Stack<>();

    // Add token to the queue
    static void register(int token) {
        inputStack.push(token);
    }

    // Process the oldest token
    static int next() {

        // Transfer elements only when outputStack is empty
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }

        // Queue is empty
        if (outputStack.isEmpty()) {
            return -1;
        }

        return outputStack.pop();
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine().trim());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < q; i++) {

            String line = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(line);

            String operation = st.nextToken();

            if (operation.equals("REGISTER")) {

                int token = Integer.parseInt(st.nextToken());
                register(token);

            } else if (operation.equals("NEXT")) {

                answer.append(next()).append('\n');
            }
        }

        System.out.print(answer);
    }
}