package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends CompositeExpression {

    @Override
    protected int getIdentityValue() {
        return 1;
    }

    @Override
    protected int applyOperation(int currentResult, int childResult) {
        return currentResult * childResult;
    }
}
