package Main.SnakeMovementsValidators;

import Main.Movements.Movement;
import Main.Uitls.NumericUtils;

public class DefaultSnakeMovementValidator implements ISnakeMovementValidator{

    @Override
    public boolean isValidMovement(int[] board, int [][] snake, Movement movement) {
        return snakeStillInsideBoardAfterMovement(board, snake, movement) && snakeDontCollideItselfAfterMovement(snake, movement);
    }

    /**
     *
     * @param snake the snake whose collision we want to check.
     * @param movement the movement that the snake is going to do.
     * @return true if by applying the movement given as parameter, the
     * snake doesn't collide with its own body.
     */
    private boolean snakeDontCollideItselfAfterMovement(int [][] snake, Movement movement) {
        int newHeadRow = snake[0][0] + movement.getDeltaRow();
        int newHeadColumn = snake[0][1] + movement.getDeltaColumn();

        for (int i = 0; i < snake.length - 1; i++)
            if (newHeadRow == snake[i][0] && newHeadColumn == snake[i][1]) return false;

        return true;
    }

    /**
     *
     * @param board the board where the snake is placed.
     * @param snake the snake whose valid position after the movement we
     *              want to check.
     * @param movement the movement that the snake is going to do.
     * @return true if after applying the movement given as parameter, the
     * snake does not get out of the board.
     */
    private boolean snakeStillInsideBoardAfterMovement(int[] board, int [][] snake, Movement movement) {
        int newHeadRow = snake[0][0] + movement.getDeltaRow();
        int newHeadColumn = snake[0][1] + movement.getDeltaColumn();

        return NumericUtils.isInRange(newHeadRow, board[0] - 1) && NumericUtils.isInRange(newHeadColumn, board[1] - 1);
    }
}
