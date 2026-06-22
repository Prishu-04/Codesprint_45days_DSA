import java.util.*;

public class ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] marks = new int[N];

        for (int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();
        }

        // Sort in descending order
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = marks[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        // Store score -> rank
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (!rankMap.containsKey(arr[i])) {
                rankMap.put(arr[i], i + 1);
            }
        }

        int Q = sc.nextInt();

        while (Q-- > 0) {
            int score = sc.nextInt();

            if (rankMap.containsKey(score)) {
                System.out.println("Rank " + rankMap.get(score));
            } else {
                System.out.println("No Rank");
            }
        }

        sc.close();
    }
}