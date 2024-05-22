package CrackingTheCodeCh8;

public class PaintFill {

    public static boolean fillWithPaint(int[][] screen, int x, int y, int newColor){
        int oldColor = screen[y][x];
        if(oldColor == newColor){
            return false;
        }
        return fill(screen, x, y, oldColor, newColor);
    }

    private static boolean fill(int[][] screen, int x, int y, int oldColor, int newColor) {
        // Check if the current position is out of the boundaries of the screen
        if (x < 0 || x >= screen[0].length || y < 0 || y >= screen.length) {
            return false;
        }

        // Check if the current position is the color that needs to be changed
        if (screen[y][x] == oldColor) {
            screen[y][x] = newColor; // Change the color
            // Recursively call fill for the adjacent cells (north, south, east, west)
            fill(screen, x + 1, y, oldColor, newColor);
            fill(screen, x - 1, y, oldColor, newColor);
            fill(screen, x, y + 1, oldColor, newColor);
            fill(screen, x, y - 1, oldColor, newColor);
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] screen = {
                {1, 1, 1, 2, 1},
                {1, 2, 2, 2, 1},
                {1, 2, 1, 2, 1},
                {1, 1, 1, 1, 1}
        };

        // Apply paint fill at position (2,2) with color 3
        fillWithPaint(screen, 2, 2, 3);

        // Print the updated screen
        for (int[] row : screen) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
