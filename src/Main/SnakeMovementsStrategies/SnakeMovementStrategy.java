package Main.SnakeMovementsStrategies;

import Main.Uitls.Movement;

public interface SnakeMovementStrategy {
    int[][] moveSnake(int[][] snake, Movement movement);
}
