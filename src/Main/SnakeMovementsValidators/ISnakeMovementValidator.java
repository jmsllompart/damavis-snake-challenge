package Main.SnakeMovementsValidators;

import Main.Movements.Movement;

public interface ISnakeMovementValidator {
    /**
     * Determines if we can apply the movement to the snake.
     * @param board the board where the snake is placed.
     * @param snake the snake which movement validity we want to check.
     * @param movement the movement that the snake is willing to perform.
     * @return true if the introduced movement is valid.
     */
    boolean isValidMovement(int[] board, int [][] snake, Movement movement);
}
