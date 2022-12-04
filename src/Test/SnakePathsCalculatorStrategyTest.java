package Test;

import Main.SnakePathsCalculator.NaiveRecursiveStrategy;
import Main.SnakePathsCalculator.SnakePathsCalculatorStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SnakePathsCalculatorStrategyTest {

    @Test
    void calculateNumberOfPossiblePaths() {

        int [][] boards = {{4, 3}, {2, 3}, {10, 10}};

        int[][][] snakes = {{{2,2}, {3,2}, {3,1}, {3,0}, {2,0}, {1,0}, {0,0}},
                {{0,2}, {0,1}, {0,0}, {1,0}, {1,1}, {1,2}},
                {{5,5}, {5,4}, {4,4}, {4,5}}};

        int [] depths = {3, 10, 4};

        int [] results = {7, 1, 81};

        SnakePathsCalculatorStrategy snakePathsCalculator = new NaiveRecursiveStrategy();

        Assertions.assertAll(() -> Assertions.assertEquals(results[0], snakePathsCalculator.calculateNumberOfPossiblePaths(boards[0], snakes[0], depths[0])),
                () -> Assertions.assertEquals(results[1], snakePathsCalculator.calculateNumberOfPossiblePaths(boards[1], snakes[1], depths[1])),
                () -> Assertions.assertEquals(results[2], snakePathsCalculator.calculateNumberOfPossiblePaths(boards[2], snakes[2], depths[2])));


    }
}