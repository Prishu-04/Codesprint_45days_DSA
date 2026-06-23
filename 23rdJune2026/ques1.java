import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();

            pq.add(val);

            if (pq.size() > k) {
                pq.poll(); // remove smallest, keep only K largest
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}