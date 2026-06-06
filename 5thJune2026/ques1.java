import java.util.Scanner;

public class ques1 {

    static class Node {
        int id;
        Node next;

        Node(int id) {
            this.id = id;
        }
    }

    public static int findSurvivor(int[] participantIds, long k) {
        Node head = new Node(participantIds[0]);
        Node tail = head;

        for (int i = 1; i < participantIds.length; i++) {
            Node newNode = new Node(participantIds[i]);
            tail.next = newNode;
            tail = newNode;
        }

        tail.next = head;

        Node current = head;
        Node previous = tail;
        int remainingParticipants = participantIds.length;

        while (remainingParticipants > 1) {
            long steps = (k - 1) % remainingParticipants;

            for (long i = 0; i < steps; i++) {
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
            current = previous.next;

            remainingParticipants--;
        }

        return current.id;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] participantIds = new int[n];

        for (int i = 0; i < n; i++) {
            participantIds[i] = scanner.nextInt();
        }

        long k = scanner.nextLong();

        System.out.println(findSurvivor(participantIds, k));

        scanner.close();
    }
}