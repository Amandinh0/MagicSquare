import java.util.*;

public class MagicSquare {
    private static int square [][];

    public static void main(String[] args) {
        BuildSquare(3);
    }

    public static void BuildSquare(int dimensions) {
        square= new int[dimensions][dimensions];
        int dimension = square.length;
        int row = 0;
        int col = square[0].length / 2;
        square[row][col] = 1;
        int numb = 1;
        int row_now;
        int col_now;
        while (numb <= dimension * dimension) {
            square[row][col] = numb;
            numb++;
            row_now = row;
            col_now = col;
            row -= 1;
            col += 1;
            if (row == -1) {
                row = dimension - 1;
            }
            if (col == dimension) {
                col = 0;
            }
            if ((row == 0) && (col == numb - 1)) {
                row += 1;
            } else if (square[row][col] != 0) {
                row = row_now + 1;
                col = col_now;

            }

        }
        printSquare();
    }


    public static void printSquare() {
        for (int r = 0; r < square.length; r++) {
            for (int c = 0; c < square[r].length; c++) {
                System.out.print("  " + square[r][c] + "  ");
            }
            System.out.println();
        }

    }

}
