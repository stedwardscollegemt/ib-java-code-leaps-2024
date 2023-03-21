package topic05learningaids;

/**
 * 5.1.4 - Describe the nature of 2D arrays.
 * 5.1.5 - Construct algorithms with 2D arrays.
 */
public class NoughtsAndCrosses {

    static char[][] grid;
    
    public static void main(String[] args) {
        // allocate memory for my grid
        grid = new char[3][3];
        // display empty grid
        displayGrid();

        // filling the first row with crosses
        grid[0][0] = 'X';
        grid[0][1] = 'X';
        grid[0][2] = 'X';

        // display grid with winning X streak
        // displayGrid();
        // System.out.println("Horizontal Check Row 0: " + horizontalCheck(0, 'X'));

        // filling the first diagonal with noughts
        grid[0][2] = 'O';
        grid[1][1] = 'O';
        grid[2][0] = 'O';
        displayGrid();
        System.out.println("Diagonal Check: " + diagonalCheck('O'));

        // TODO: display grid with winning O streak
    }

    public static void displayGrid() {
        // key lesson is navigating through a 2D array
        // using nested for loops
        for (int row = 0; row < 3; row++) { // jump to row (vertically)
            System.out.println("-------------------");
            for (int col = 0; col < 3; col++) { // jump to col (horizontally)
                // check if there is a chracter if not put a space
                // this is only for pretty display reasons
                if (grid[row][col] == 0) {
                    grid[row][col] = ' ';
                }
                System.out.print("|  " + grid[row][col]);
                // if we are at the edge of a row close the grid
                if (col == 2) {
                    System.out.print("  |");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }

    public static boolean horizontalCheck(int row, char symbol) {
        for (int i = 0; i < grid[row].length; i++) {
            if (grid[row][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean verticalCheck(int col, char symbol) {
        for (int row = 0; row < grid.length; row++) {
            if (grid[row][col] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean diagonalCheck(char symbol) {
        boolean winRight = true;
        boolean winLeft = true;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (row == col) {
                    if (grid[row][col] != symbol) {
                        winRight = false;
                    }
                } else if ((row + col) == grid.length - 1) {
                    if (grid[row][col] != symbol) {
                        winLeft = false;
                    }
                }
            }
        }
        return winRight || winLeft;
    }

    public static boolean isWinningMove(int index, char symbol) {
        return diagonalCheck(symbol) || verticalCheck(index, symbol) || horizontalCheck(index, symbol);
    }
}
