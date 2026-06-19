import java.io.*;
import java.util.*;

public class ques2 {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int k = fs.nextInt();

        int[] noise = new int[n];

        for (int i = 0; i < n; i++) {
            noise[i] = fs.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {

            // Remove indices that are outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty()
                    && noise[deque.peekLast()] <= noise[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Window is complete
            if (i >= k - 1) {
                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(noise[deque.peekFirst()]);
            }
        }

        System.out.println(result);
    }

    static class FastScanner {
        private final InputStream input;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer = 0;
        private int length = 0;

        FastScanner(InputStream input) {
            this.input = input;
        }

        private int read() throws IOException {
            if (pointer >= length) {
                length = input.read(buffer);
                pointer = 0;

                if (length == -1) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        int nextInt() throws IOException {
            int ch;
            int sign = 1;
            int value = 0;

            do {
                ch = read();
            } while (ch <= ' ' && ch != -1);

            if (ch == '-') {
                sign = -1;
                ch = read();
            }

            while (ch > ' ') {
                value = value * 10 + (ch - '0');
                ch = read();
            }

            return value * sign;
        }
    }
}