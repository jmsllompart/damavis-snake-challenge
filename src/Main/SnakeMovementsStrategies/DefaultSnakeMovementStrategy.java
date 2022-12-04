package Main.SnakeMovementsStrategies;

import Main.Movements.Movement;

public class DefaultSnakeMovementStrategy implements SnakeMovementStrategy{
    @Override
    public int[][] moveSnake(int[][] snake, Movement movement) {
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
