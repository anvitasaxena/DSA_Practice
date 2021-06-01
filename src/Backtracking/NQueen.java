package Backtracking;

public class NQueen {
    private static boolean isSafe(int[][] board, int r, int c, int n) {
        for(int i = 0;i < c;i++) {
            if(board[r][i] == 1) {
                return false;
            }
        }
        for(int i = 0;i < r;i++) {
            if(board[i][c] == 1) {
                return false;
            }
        }
        int i = 1;
        while(r + i < n && c - i >= 0) {
            if(board[r + i][c - i] == 1) {
                return false;
            }
            i++;
        }
        i = 1;
        while(r - i >= 0 && c - i >= 0) {
            if(board[r - i][c - i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static void printBoard(int[][] board, int n) {
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------");
    }

    private static boolean solveNQueen(int[][] board, int c, int n) {

        if(c == n) {
            printBoard(board, n);
            return true;
        }

        for(int r = 0;r < n;r++) {
            if(isSafe(board, r, c, n)) {
                board[r][c] = 1;
                if(solveNQueen(board, c + 1, n)) {
                    return true; // To stop multiple solutions
                }
                board[r][c] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        solveNQueen(board, 0, n);
    }
}
