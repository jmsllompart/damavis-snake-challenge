package Main.Uitls;

public class Movement {
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
