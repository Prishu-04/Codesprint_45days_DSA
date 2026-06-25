import java.util.*;

public class ques1 {

    static int n;
    static char[][] board;
    static boolean[] col, diag1, diag2;
    static boolean found = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        col = new boolean[n];
        diag1 = new boolean[2 * n - 1]; // row + col
        diag2 = new boolean[2 * n - 1]; // row - col + n - 1

        solve(0);

        if (!found) {
            System.out.println("-1");
        }
    }

    static void solve(int row) {
        if (row == n) {
            found = true;
            printBoard();
            return;
        }

        for (int c = 0; c < n; c++) {
            int d1 = row + c;
            int d2 = row - c + n - 1;

            if (!col[c] && !diag1[d1] && !diag2[d2]) {
                board[row][c] = 'Q';
                col[c] = true;
                diag1[d1] = true;
                diag2[d2] = true;

                solve(row + 1);

                board[row][c] = '.';
                col[c] = false;
                diag1[d1] = false;
                diag2[d2] = false;
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < n; i++) {
            System.out.println(new String(board[i]));
        }
    }
}