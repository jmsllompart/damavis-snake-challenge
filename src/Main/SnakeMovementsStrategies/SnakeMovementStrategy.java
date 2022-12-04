package Main.SnakeMovementsStrategies;

import Main.Movements.Movement;

public interface SnakeMovementStrategy {
    /**
     *
     * @param snake the snake that is going to do the movement.
     * @param movement the movement that the snake is going to do.
     * @return a bi-dimensional array representing the new snake position
     * after doing the movement.
     */
    int[][] moveSnake(int[][] snake, Movement movement);
}
