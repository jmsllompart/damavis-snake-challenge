package Main.SnakePathsCalculator;

import Main.SnakeMovementsStrategies.SnakeMovementStrategy;
import Main.Movements.Movement;
import Main.SnakeMovementsValidators.*;
import Main.Movements.MovementSet;

public class NaiveRecursiveSnakePathsCalculator implements ISnakePathsCalculator {
    private final ISnakeMovementValidator snakeMovementValidator;
    private final SnakeMovementStrategy snakeMovementStrategy;
    private final MovementSet possibleMovements;

    public NaiveRecursiveSnakePathsCalculator(ISnakeMovementValidator snakeMovementValidator, SnakeMovementStrategy snakeMovementStrategy, MovementSet possibleMovements) {
        this.snakeMovementValidator = snakeMovementValidator;
        this.snakeMovementStrategy = snakeMovementStrategy;
        this.possibleMovements = possibleMovements;
    }

    @Override
    public int calculateNumberOfPossiblePaths(int[] board, int[][] snake, int depth) {
        if (depth == 0) return 1;

        int numberOfPossiblePaths = 0;

        for (Movement movement : this.possibleMovements.getMovements())
            if (snakeMovementValidator.isValidMovement(board, snake, movement))
                numberOfPossiblePaths += calculateNumberOfPossiblePaths(board, snakeMovementStrategy.moveSnake(snake, movement), depth - 1);

        return numberOfPossiblePaths % (1000000000 + 7);
    }
}
