import java.util.*;

public class Main {

    static class Query {
        int l, r, index;

        Query(int l, int r, int index) {
            this.l = l;
            this.r = r;
            this.index = index;
        }
    }

    static int[] arr;
    static HashMap<Integer, Integer> freq = new HashMap<>();
    static long currentScore = 0;

    static void add(int value) {
        int oldFreq = freq.getOrDefault(value, 0);

        currentScore -= (long) oldFreq * oldFreq;

        int newFreq = oldFreq + 1;
        freq.put(value, newFreq);

        currentScore += (long) newFreq * newFreq;
    }

    static void remove(int value) {
        int oldFreq = freq.get(value);

        currentScore -= (long) oldFreq * oldFreq;

        int newFreq = oldFreq - 1;

        if (newFreq == 0) {
            freq.remove(value);
        } else {
            freq.put(value, newFreq);
        }

        currentScore += (long) newFreq * newFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        Query[] queries = new Query[q];

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            queries[i] = new Query(l, r, i);
        }

        int blockSize = (int) Math.sqrt(n);

        Arrays.sort(queries, (a, b) -> {
            int blockA = a.l / blockSize;
            int blockB = b.l / blockSize;

            if (blockA != blockB) {
                return blockA - blockB;
            }

            return a.r - b.r;
        });

        long[] answer = new long[q];

        int currentL = 0;
        int currentR = -1;

        for (Query query : queries) {
            int l = query.l;
            int r = query.r;

            while (currentL > l) {
                currentL--;
                add(arr[currentL]);
            }

            while (currentR < r) {
                currentR++;
                add(arr[currentR]);
            }

            while (currentL < l) {
                remove(arr[currentL]);
                currentL++;
            }

            while (currentR > r) {
                remove(arr[currentR]);
                currentR--;
            }

            answer[query.index] = currentScore;
        }

        for (int i = 0; i < q; i++) {
            System.out.println(answer[i]);
        }

        sc.close();
    }
}