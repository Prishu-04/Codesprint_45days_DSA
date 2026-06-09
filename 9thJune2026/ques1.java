import java.util.*;

public class ques1 {

    static int[][] minTable;
    static int[][] maxTable;
    static int[] log;

    static void buildSparseTable(int[] arr, int n) {
        log = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int k = log[n] + 1;

        minTable = new int[n][k];
        maxTable = new int[n][k];

        for (int i = 0; i < n; i++) {
            minTable[i][0] = arr[i];
            maxTable[i][0] = arr[i];
        }

        for (int j = 1; j < k; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                minTable[i][j] = Math.min(
                    minTable[i][j - 1],
                    minTable[i + (1 << (j - 1))][j - 1]
                );

                maxTable[i][j] = Math.max(
                    maxTable[i][j - 1],
                    maxTable[i + (1 << (j - 1))][j - 1]
                );
            }
        }
    }

    static int queryMin(int l, int r) {
        int len = r - l + 1;
        int j = log[len];

        return Math.min(
            minTable[l][j],
            minTable[r - (1 << j) + 1][j]
        );
    }

    static int queryMax(int l, int r) {
        int len = r - l + 1;
        int j = log[len];

        return Math.max(
            maxTable[l][j],
            maxTable[r - (1 << j) + 1][j]
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        buildSparseTable(arr, n);

        int q = sc.nextInt();

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int maximum = queryMax(l, r);
            int minimum = queryMin(l, r);

            System.out.println(maximum - minimum);
        }

        sc.close();
    }
}