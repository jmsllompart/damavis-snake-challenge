package Main.SnakePathsCalculator;

public interface ISnakePathsCalculator {
    /**
     * Calculates the number of possible paths that the snake
     * can do on the given board and with the given depth.
     * @param board the board where the snake is positioned.
     * @param snake the snake that is going to move through
     *              the board.
     * @param depth the length of the paths that we are calculating.
     * @return the number of possible paths.
     */
    int calculateNumberOfPossiblePaths(int[] board, int[][] snake, int depth);
}
