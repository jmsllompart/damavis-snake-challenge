package Main.SnakePathsCalculator;

import Main.SnakeMovementsStrategies.DefaultSnakeMovementStrategy;
import Main.SnakeMovementsStrategies.SnakeMovementStrategy;
import Main.Uitls.Movement;
import Main.SnakeMovementsValidators.*;

public class NaiveRecursiveSnakePathsCalculator implements ISnakePathsCalculator {
    private final ISnakeMovementValidator snakeMovementValidator;
    private final SnakeMovementStrategy snakeMovementStrategy;


    Movement[] possibleMovements = {new Movement(1, 0),
                                    new Movement(0, 1),
                                    new Movement(-1, 0),
                                    new Movement(0, -1)};


    public NaiveRecursiveSnakePathsCalculator() {

        snakeMovementValidator = new DefaultSnakeMovementValidator();
        snakeMovementStrategy = new DefaultSnakeMovementStrategy();
    }

    @Override
    public int calculateNumberOfPossiblePaths(int[] board, int[][] snake, int depth) {
        if (depth == 0) return 1;

        int numberOfPossiblePaths = 0;

        for (Movement movement : this.possibleMovements)
            if (snakeMovementValidator.isValidMovement(board, snake, movement))
                numberOfPossiblePaths += calculateNumberOfPossiblePaths(board, snakeMovementStrategy.moveSnake(snake, movement), depth - 1);

        return numberOfPossiblePaths;
    }
}
