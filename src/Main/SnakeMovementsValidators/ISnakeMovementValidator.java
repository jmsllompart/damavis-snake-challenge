package Main.SnakeMovementsValidators;

import Main.Uitls.Movement;

public interface ISnakeMovementValidator {
    boolean isValidMovement(int[] board, int [][] snake, Movement movement);
}
