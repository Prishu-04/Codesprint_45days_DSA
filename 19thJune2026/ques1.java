import java.io.*;
import java.util.*;

public class ques1 {

    static class Passenger {
        int passengerId;
        int priority;
        int arrivalOrder;

        Passenger(int passengerId, int priority, int arrivalOrder) {
            this.passengerId = passengerId;
            this.priority = priority;
            this.arrivalOrder = arrivalOrder;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();

        PriorityQueue<Passenger> boardingQueue =
                new PriorityQueue<>((p1, p2) -> {

                    // Higher priority passenger boards first
                    if (p1.priority != p2.priority) {
                        return Integer.compare(p2.priority, p1.priority);
                    }

                    // For equal priority, earlier passenger boards first
                    return Integer.compare(p1.arrivalOrder, p2.arrivalOrder);
                });

        for (int i = 0; i < n; i++) {
            int passengerId = fs.nextInt();
            int priority = fs.nextInt();

            boardingQueue.offer(
                    new Passenger(passengerId, priority, i)
            );
        }

        StringBuilder output = new StringBuilder();

        while (!boardingQueue.isEmpty()) {
            output.append(boardingQueue.poll().passengerId)
                  .append('\n');
        }

        System.out.print(output);
    }

    // Fast input reader
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
            int character;
            int sign = 1;
            int number = 0;

            do {
                character = read();
            } while (character <= ' ' && character != -1);

            if (character == '-') {
                sign = -1;
                character = read();
            }

            while (character > ' ') {
                number = number * 10 + (character - '0');
                character = read();
            }

            return number * sign;
        }
    }
}