package Main.SnakeMovementsStrategies;

import Main.Movements.Movement;

public interface SnakeMovementStrategy {
    int[][] moveSnake(int[][] snake, Movement movement);
}
