package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends CompositeExpression {

    @Override
    protected int getIdentityValue() {
        return 0;
    }

    @Override
    protected int applyOperation(int currentResult, int childResult) {
        return currentResult + childResult;
    }
}