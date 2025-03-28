package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<>();
    private int lastObservedResult;

    public void add(MathExpression expression) {
        children.add(expression);
        if (expression instanceof Observable) {
            ((Observable) expression).addObserver(this);
        }
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println("Updated MultiplyComposite result: " + lastObservedResult);
    }

    @Override
    public int getResult() {
        int product = 1;
        for (MathExpression child : children) {
            product *= child.getResult();
        }
        return product;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
