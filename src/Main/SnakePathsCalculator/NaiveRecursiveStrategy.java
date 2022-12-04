package Main.SnakePathsCalculator;

import Main.Uitls.Movement;

public class NaiveRecursiveStrategy implements SnakePathsCalculatorStrategy {

    Movement[] possibleMovements = {new Movement(1, 0),
                                    new Movement(0, 1),
                                    new Movement(-1, 0),
                                    new Movement(0, -1)};

    @Override
    public int calculateNumberOfPossiblePaths(int[] board, int[][] snake, int depth) {
        if (depth == 0) return 1;

        int numberOfPossiblePaths = 0;

        for (Movement movement : this.possibleMovements)
            if (canDoMovement(board, snake, movement))
                numberOfPossiblePaths += calculateNumberOfPossiblePaths(board, move(snake, movement), depth - 1);

        return numberOfPossiblePaths;
    }

    boolean canDoMovement(int[] board, int [][] snake, Movement movement) {
        return snakeStillInsideBoardAfterMovement(board, snake, movement) && snakeDontCollideItselfAfterMovement(snake, movement);
    }

    boolean snakeDontCollideItselfAfterMovement(int [][] snake, Movement movement) {
        int newHeadRow = snake[0][0] + movement.getDeltaRow();
        int newHeadColumn = snake[0][1] + movement.getDeltaColumn();

        for (int i = 0; i < snake.length - 1; i++)
            if (newHeadRow == snake[i][0] && newHeadColumn == snake[i][1]) return false;

        return true;
    }

    boolean snakeStillInsideBoardAfterMovement(int[] board, int [][] snake, Movement movement) {
        int newHeadRow = snake[0][0] + movement.getDeltaRow();
        int newHeadColumn = snake[0][1] + movement.getDeltaColumn();

        return isInRange(newHeadRow, board[0] - 1) && isInRange(newHeadColumn, board[1] - 1);
    }

    boolean isInRange(int n, int upperBound) {
        return  (n >= 0) && (n <= upperBound);
    }

    public int[][] move(int[][] snake, Movement movement) {
        int [][] newSnake = new int[snake.length][snake[0].length];

        for (int i = snake.length - 1; i > 0; i--){
            newSnake[i][1] = snake[i - 1][1];
            newSnake[i][0] = snake[i - 1][0];
        }

        newSnake[0][0] = snake[0][0] + movement.getDeltaRow();
        newSnake[0][1] = snake[0][1] + movement.getDeltaColumn();

        return newSnake;
    }
}
