package topic05learningaids;

/**
 * Describe the nature of 2D arrays.
 * Construct algorithms with 2D arrays.
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
        displayGrid();
    }

    public static void displayGrid() {
        // key lesson is navigating through a 2D array
        // using nested for loops
        for (int row = 0; row < 3; row++) { // jump to row (vertically)
            System.out.println("---------------------");
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
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------------");
    }

    public static boolean horizontalCheck(int row, char symbol) {
        // TODO
        return false;
    }

    public static boolean verticalCheck(int col, char symbol) {
        // TODO
        return false;
    }

    public static boolean diagonalCheck(int col, char symbol) {
        // TODO
        return false;
    }

    public static boolean isWinningMove(int col, char symbol) {
        return diagonalCheck(col, symbol) || verticalCheck(col, symbol) || horizontalCheck(col, symbol);
    }
}
