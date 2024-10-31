public class PlayGround {
    private final char[][] board = new char[3][3];

    public PlayGround() {
        init();
    }


    public void setSymbol(int row, int col, Symbol symbol) {
        board[row][col] = symbol.getValue();
    }


    public void init() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Symbol.BLANK.getValue();
            }
        }
    }


    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


}