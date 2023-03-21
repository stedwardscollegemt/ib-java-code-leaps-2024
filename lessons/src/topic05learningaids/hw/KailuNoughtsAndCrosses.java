package topic05learningaids.hw;

import helpers.Keyboard;

public class KailuNoughtsAndCrosses {
    // declare char 2D array here
    static char[][] grid;
    static char symbol;
    static char compsymbol;
    static int turn = 0;
    
    public static void main(String[] args) {
        // allocate memory for my grid
        grid = new char[3][3];

        // create and get symbol
        int randomchance = rand(0, 1);	
        if (randomchance == 0){
            symbol = 'X';
            compsymbol = 'O';
            System.out.println("You are X");
        }
        else {
            symbol = 'O';
            compsymbol = 'X';
            System.out.println("You are O");
        }

        displayGrid();
        for (int i = 0; i < 3; i++) {
            // TODO: Compare what you had with what I changed here (Ms C)
            // To check for a winning move, pass in both row and col
            // and it has to be the value returned by the method
            int row = inputrow(i);
            int col = inputcol(i);
            grid[row][col] = symbol;
            if(isWinningMove(col, row, symbol) == true) {
                System.out.println("Winning Move");
            }
        }

        displayGrid();
    }

    // displaying the grid
    public static void displayGrid() {
        // key lesson is navigating through the 2D array
        // using nested for loops
        for (int row = 0; row < grid.length; row++) { // jump to row (vertically)
            System.out.println("-------------------");
            for (int col = 0; col < grid[0].length; col++) { // jump to col (horizontally)
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

    // Input row
    public static int inputrow(int row) {
        System.out.println("What row?");
        row = Keyboard.readInt();
        return row - 1; 
    }

    // input column
    public static int inputcol(int col) {
        System.out.println("What column?");
        col = Keyboard.readInt();
        return col - 1; 
    }

    // Horizontal check
    public static boolean horizontalCheck(int row, char symbol) {
        for (int i = 0; i < grid[row].length; i++) {
            if (grid[row][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    // Vertical check
    public static boolean verticalCheck(int col, char symbol) {
        for (int row = 0; row < grid.length; row++) {
            if (grid[row][col] == symbol) {
                return false;
            }
        }
        return true;
    }

    // Diagonally checking
    public static boolean diagonalCheck(char symbol) {
        boolean WinRight = true;
        boolean WinLeft = true;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if (row== col){
                    if(grid[row][col] != symbol){
                        return WinRight;
                    }
                }
                else if ((row + col) == grid.length - 1){
                    if(grid[row][col] != symbol){
                        WinLeft = false;
                    }
                }
            }
        }
        return WinRight || WinLeft;
    }

    // Check if the given symbol is a winning move.
    public static boolean isWinningMove(int col, int row, char symbol) {
        return verticalCheck(col, symbol) || horizontalCheck(row, symbol);
    }

    // Random selection
    public static int rand(int min, int max)
    {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }
 
        double rand = Math.random();
        return (int)(rand * ((max - min) + 1)) + min;
    }
}
