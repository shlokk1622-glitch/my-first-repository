public class queens {
    public static void nQueens(char board[][], int i) {
        if (i == board.length) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            board[i][j] = 'Q';
            nQueens(board, i++);
            board[i][j] = '.';
        }
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("-------");
            for (int j = 0; j < board.length; j++) {
                System.out.println(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}