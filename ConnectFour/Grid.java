package ConnectFour;

public class Grid {
    private int rows;
    private int columns;
    private int[][] grid;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        initGrid();
    }

    public void initGrid() {
        this.grid = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = GridPosition.EMPTY.ordinal();
            }
        }
    }

    public int[][] getGrid() {
        return this.grid;
    }

    public int getColumnCount() {
        return this.columns;
    }

    public int placePiece(int column, GridPosition piece) {
        if (column < 0 || column >= this.columns) {
            throw new Error("Invalid column");
        }
        if (piece == GridPosition.EMPTY) {
            throw new Error("Invalid piece");
        }
        // Place piece in the lowest empty row
        for (int row = this.rows - 1; row >= 0; row--) {
            if (this.grid[row][column] == GridPosition.EMPTY.ordinal()) {
                this.grid[row][column] = piece.ordinal();
                return row;
            }
        }
        return -1;
    }

    public boolean checkWin(int connectN, int row, int col, GridPosition piece) {
        // Check horizontal
        int count = 0;
        for (int c = 0; c < this.columns; c++) {
            if (this.grid[row][c] == piece.ordinal()) {
                count++;
            } else {
                count = 0;
            }
            if (count == connectN) {
                return true;
            }
        }

        // Check vertical
        count = 0;
        for (int r = 0; r < this.rows; r++) {
            if (this.grid[r][col] == piece.ordinal()) {
                count++;
            } else {
                count = 0;
            }
            if (count == connectN) {
                return true;
            }
        }

        // Check diagonal
        count = 0;
        for (int r = 0; r < this.rows; r++) {
            int c = row + col - r; // row + col = r + c, for a diagonal
            if (c >= 0 && c < this.columns && this.grid[r][c] == piece.ordinal()) {
                count++;
            } else {
                count = 0;
            }
            if (count == connectN) {
                return true;
            }
        }

        // Check anti-diagonal
        count = 0;
        for (int r = 0; r < this.rows; r++) {
            int c = col - row + r; // row - col = r - c, for an anti-diagonal
            if (c >= 0 && c < this.columns && this.grid[r][c] == piece.ordinal()) {
                count++;
            } else {
                count = 0;
            }
            if (count == connectN) {
                return true;
            }
        }
        return false;
    }
}
