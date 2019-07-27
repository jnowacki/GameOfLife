package pl.jnowacki;

public class Board {

    private int size = 5;

    private boolean[][] grid;

    public Board() {
        initGrid();
    }

    public Board(boolean[][] grid) {
        this.grid = grid;
        this.size = this.grid.length;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((grid[i][j] ? "x" : "-") + "  ");
            }
            System.out.println();
        }
    }

    private void initGrid() {
        grid = new boolean[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = getRandomCellState();
            }
        }
    }

    private boolean getRandomCellState() {
        return Math.random() > 0.7;
    }

    protected int getNeighbours(int x, int y) {

        int aliveNeighbours = 0;

        for(int i = x - 1; i <= x + 1; i++) {
            if (i >= 0 && i < size) {
                for (int j = y - 1; j <= y + 1; j++)
                    if (j >= 0 && j < size) {
                        if (!(i == x && j == y) && grid[i][j]) {
                            aliveNeighbours++;
                        }
                    }
            }
        }



        return aliveNeighbours;
    }
}
