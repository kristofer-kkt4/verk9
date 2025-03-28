package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;
public class NumberLeaf extends Observable implements MathExpression {
    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    public void setValue(int newValue) {
        this.number = newValue;
        notifyObservers(); // Notify observers of the change
    }

    @Override
    public int getResult() {
        return number;
    }
}
