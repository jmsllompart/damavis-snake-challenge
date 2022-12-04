package Main.SnakeMovementsValidators;

import Main.Movements.Movement;

public interface ISnakeMovementValidator {
    boolean isValidMovement(int[] board, int [][] snake, Movement movement);
}
