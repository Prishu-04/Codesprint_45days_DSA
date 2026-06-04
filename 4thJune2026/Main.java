import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Function to find intersection node
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static Node createList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static Node findNode(Node head, int x) {
        Node current = head;

        while (current != null) {
            if (current.data == x) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public static Node createSecondList(int[] arr, int x, Node intersectionNode) {
        if (arr.length == 0) {
            return null;
        }

        if (x != -1 && arr[0] == x) {
            return intersectionNode;
        }

        Node head = null;
        Node current = null;

        for (int i = 0; i < arr.length; i++) {
            if (x != -1 && arr[i] == x) {
                if (current != null) {
                    current.next = intersectionNode;
                }
                break;
            }

            Node newNode = new Node(arr[i]);

            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] path1 = new int[n];
        for (int i = 0; i < n; i++) {
            path1[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] path2 = new int[m];
        for (int i = 0; i < m; i++) {
            path2[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        Node headA = createList(path1);

        Node intersectionNode = null;

        if (x != -1) {
            intersectionNode = findNode(headA, x);
        }

        Node headB;

        if (x == -1) {
            headB = createList(path2);
        } else {
            headB = createSecondList(path2, x, intersectionNode);
        }

        Node answer = getIntersectionNode(headA, headB);

        if (answer == null) {
            System.out.println(-1);
        } else {
            System.out.println(answer.data);
        }

        sc.close();
    }
}