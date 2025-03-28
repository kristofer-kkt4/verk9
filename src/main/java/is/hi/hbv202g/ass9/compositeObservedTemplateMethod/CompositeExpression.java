package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeExpression implements MathExpression, Observer {
    // Protected field to store child expressions (accessible by subclasses)
    protected List<MathExpression> children = new ArrayList<>();
    protected int lastObservedResult;

    // Add a child to the composite expression and register as an observer
    public void add(MathExpression expression) {
        children.add(expression);
        if (expression instanceof Observable) {
            ((Observable) expression).addObserver(this);
        }
    }

    // Update method called when an observable changes
    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println("Updated result: " + lastObservedResult);
    }

    // Template Method: Uses the abstract method to perform operation on children
    @Override
    public int getResult() {
        int result = getIdentityValue();
        for (MathExpression child : children) {
            result = applyOperation(result, child.getResult());
        }
        return result;
    }

    // Abstract methods for subclasses to provide specific behavior
    protected abstract int getIdentityValue(); // Identity value for the operation
    protected abstract int applyOperation(int currentResult, int childResult); // Specific operation

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
