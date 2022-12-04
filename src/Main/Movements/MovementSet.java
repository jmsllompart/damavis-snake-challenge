package Main.Movements;

import java.util.ArrayList;

public class MovementSet {

    /**
     * This factory method, creates a new MovementSet that contains
     * the movements known as UP, DOWN, RIGHT & LEFT.
     * @return the new movement set.
     */
    public static MovementSet createFourDirectionMovementSet() {
        MovementSet movementSet = new MovementSet();

        movementSet.addMovement(Movement.UP_MOVEMENT);
        movementSet.addMovement(Movement.DOWN_MOVEMENT);
        movementSet.addMovement(Movement.RIGHT_MOVEMENT);
        movementSet.addMovement(Movement.LEFT_MOVEMENT);

        return movementSet;
    }

    private final ArrayList<Movement> movements;

    private MovementSet() {
        this.movements = new ArrayList<>();
    }

    public void addMovement(Movement movement) {
        movements.add(movement);
    }

    public ArrayList<Movement> getMovements() {
        return movements;
    }
}
