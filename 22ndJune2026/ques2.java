import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int unique = -1;

        for (int num : freq.keySet()) {
            if (freq.get(num) == 1) {
                unique = num;
                break;
            }
        }

        Arrays.sort(arr);

        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == unique) {
                position = i + 1; // 1-indexed
                break;
            }
        }

        System.out.println(unique + " " + position);

        sc.close();
    }
}