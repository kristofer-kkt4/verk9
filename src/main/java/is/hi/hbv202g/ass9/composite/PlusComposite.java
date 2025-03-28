package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> children;

    public PlusComposite() {
        children = new ArrayList<>();
    }

    // Add a child to the composite expression
    public void add(MathExpression expression) {
        children.add(expression);
    }

    @Override
    public int getResult() {
        int sum = 0; // Identity value for addition
        for (MathExpression child : children) {
            sum += child.getResult();
        }
        return sum;
    }
}

