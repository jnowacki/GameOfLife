package pl.jnowacki;

public class Board {

    private final int SIZE = 5;

    private boolean[][] grid;

    public Board() {
        initGrid();
    }

    public void print() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print((grid[i][j] ? "x" : "-") + "  ");
            }
            System.out.println();
        }
    }

    private void initGrid() {
        grid = new boolean[SIZE][SIZE];
    }

}
