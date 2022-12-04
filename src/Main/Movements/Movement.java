package Main.Movements;

public class Movement {

    public static final Movement UP_MOVEMENT = new Movement(0, 1);
    public static final Movement DOWN_MOVEMENT = new Movement(1, 0);
    public static final Movement RIGHT_MOVEMENT = new Movement(-1, 0);
    public static final Movement LEFT_MOVEMENT = new Movement(0, -1);

    private final int deltaRow;
    private final int deltaColumn;

    public Movement(int deltaRow, int deltaColumn) {
        this.deltaRow = deltaRow;
        this.deltaColumn = deltaColumn;
    }

    public int getDeltaColumn() {
        return deltaColumn;
    }

    public int getDeltaRow() {
        return deltaRow;
    }
}
