package Main.Movements;

public class Movement {

    public static final Movement UP_MOVEMENT = new Movement(-1, 0);
    public static final Movement DOWN_MOVEMENT = new Movement(1, 0);
    public static final Movement RIGHT_MOVEMENT = new Movement(0, 1);
    public static final Movement LEFT_MOVEMENT = new Movement(0, -1);

    private final int deltaRow;
    private final int deltaColumn;

    public Movement(int deltaRow, int deltaColumn) {
        this.deltaRow = deltaRow;
        this.deltaColumn = deltaColumn;
    }

    /**
     * Getter for the deltaColumn associated with the movement.
     * deltaColumn can be seen as the variation of columns that
     * this movement represent.
     * @return the number of columns to move.
     */
    public int getDeltaColumn() {
        return deltaColumn;
    }

    /**
     * Getter for the deltaRow associated with the movement.
     * deltaRow can be seen as the variation of rows that
     * this movement represents.
     * @return the number of rows to move.
     */
    public int getDeltaRow() {
        return deltaRow;
    }
}
