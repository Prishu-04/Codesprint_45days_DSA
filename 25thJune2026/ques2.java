import java.util.*;

public class ques2 {

    static int n, m;
    static char[][] grid;
    static String word;
    static boolean[][] visited;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        word = sc.next();

        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, 0)) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }

    static boolean dfs(int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= n || col < 0 || col >= m ||
            visited[row][col] || grid[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        for (int k = 0; k < 4; k++) {
            int newRow = row + dr[k];
            int newCol = col + dc[k];

            if (dfs(newRow, newCol, index + 1)) {
                return true;
            }
        }

        visited[row][col] = false;

        return false;
    }
}