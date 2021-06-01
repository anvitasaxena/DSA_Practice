package Backtracking;

public class KnightsTour {

    static int x[] = {2,2,1,-1,-1,1,-2,-2};
    static int y[] = {1,-1,-2,-2,2,2,-1,1};

    public static boolean isSafe(int[][] board, int n, int x, int y){

            if(x <= n-1 && x >= 0){
                if(y <= n-1 && y >= 0){
                    if(board[x][y] == -1) {
                        return true;
                    }
                }
            }
        return false;
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

    public static boolean knightsTour(int[][]board, int r ,int c, int n, int count){
        if(count == n*n){
            printBoard(board, n);
            return true;
        }
        for(int i = 0;i < 8; i++){
            if(isSafe(board, n, (r+x[i]), (c+y[i]))){
                count++;
                board[r+x[i]][c+y[i]] = count;
                if(knightsTour(board,r+x[i], c+y[i], n , count)){
                    return true;
                }
                board[r+x[i]][c+y[i]] = -1;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int n = 8;
        int[][] board = {
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1}
        };
        int r = 0;
        int c = 0;
        System.out.println(knightsTour(board,r,c,n,0));
    }




}
