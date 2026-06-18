import java.io.*;
import java.util.*;

public class ques2 {

    static class CircularQueue {
        private final int[] queue;
        private final int capacity;

        private int front;
        private int rear;
        private int size;

        CircularQueue(int capacity) {
            this.capacity = capacity;
            this.queue = new int[capacity];

            front = 0;
            rear = -1;
            size = 0;
        }

        boolean isFull() {
            return size == capacity;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean enqueue(int value) {
            if (isFull()) {
                return false;
            }

            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;

            return true;
        }

        boolean dequeue() {
            if (isEmpty()) {
                return false;
            }

            front = (front + 1) % capacity;
            size--;

            return true;
        }

        int getFront() {
            if (isEmpty()) {
                return -1;
            }

            return queue[front];
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        CircularQueue circularQueue = new CircularQueue(k);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < q; i++) {

            st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();

            if (operation.equals("ENQUEUE")) {

                int token = Integer.parseInt(st.nextToken());

                if (!circularQueue.enqueue(token)) {
                    output.append("FULL").append('\n');
                }

            } else if (operation.equals("DEQUEUE")) {

                if (!circularQueue.dequeue()) {
                    output.append("EMPTY").append('\n');
                }

            } else if (operation.equals("FRONT")) {

                output.append(circularQueue.getFront()).append('\n');
            }
        }

        System.out.print(output);
    }
}