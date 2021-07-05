public class BingoChip<T,S> {
    T col;
    S num;

    public BingoChip(T col, S num) {
        this.col = col;
        this.num = num;
    }

    @Override
    public String toString() {

        return String.format("Chip:" + col + "-" + num);
    }
}

