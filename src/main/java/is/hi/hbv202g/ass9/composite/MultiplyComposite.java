package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private List<MathExpression> children;

    public MultiplyComposite() {
        children = new ArrayList<>();
    }

    // Add a child to the composite expression
    public void add(MathExpression expression) {
        children.add(expression);
    }

    @Override
    public int getResult() {
        int product = 1; // Identity value for multiplication
        for (MathExpression child : children) {
            product *= child.getResult();
        }
        return product;
    }
}