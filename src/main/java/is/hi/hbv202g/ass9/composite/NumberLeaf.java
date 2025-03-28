package is.hi.hbv202g.ass9.composite;
//NumberLeaf objects storing an actual number (for simplicity, use int) and return-
//ing this value when getResult is called
public class NumberLeaf {
    private int value = 0;
    public NumberLeaf(int value) {
        this.value = value;
    }
    public int getResult() {
        return value;
    }
}
