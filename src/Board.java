public class Board {
    private int size;
    private int[][]gameBoard;

    public Board(int size) {
        this.size = size;
        gameBoard=new int[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
}
