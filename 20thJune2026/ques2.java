import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] cost = new int[n];
        int[] energy = new int[n];

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
            energy[i] = sc.nextInt();
        }

        int[] dp = new int[x + 1];

        for (int coins = 1; coins <= x; coins++) {
            for (int i = 0; i < n; i++) {
                if (cost[i] <= coins) {
                    dp[coins] = Math.max(dp[coins], dp[coins - cost[i]] + energy[i]);
                }
            }
        }

        System.out.println(dp[x]);
    }
}