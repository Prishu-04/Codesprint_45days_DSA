import java.io.*;
import java.util.*;

public class ques2 {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        // Temporarily convert the doubly linked list into a circular list
        tail.next = head;
        head.prev = tail;

        // New tail will be at position length - k
        Node newTail = head;

        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;

        // Break the circular list
        newTail.next = null;
        newHead.prev = null;

        return newHead;
    }

    static void printList(Node head) {
        StringBuilder result = new StringBuilder();

        Node current = head;

        while (current != null) {
            result.append(current.data);

            if (current.next != null) {
                result.append(" ");
            }

            current = current.next;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n == 0) {
            return;
        }

        Node head = new Node(scanner.nextInt());
        Node tail = head;

        for (int i = 1; i < n; i++) {
            Node newNode = new Node(scanner.nextInt());

            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
        }

        head = rotateRight(head, k);

        printList(head);

        scanner.close();
    }
}