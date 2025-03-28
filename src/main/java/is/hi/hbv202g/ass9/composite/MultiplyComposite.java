package is.hi.hbv202g.ass9.composite;
//MultiplyComposite objects storing an arbitrary amount of mathematical expres-
//sions as children that are multiplied with each other when getResult is called.
public class MultiplyComposite {
    private MathExpression[] children = new MathExpression[0];

    public void add(MathExpression mathExpression) {
        MathExpression[] newChildren = new MathExpression[this.children.length + 1];
        for (int i = 0; i < this.children.length; i++) {
            newChildren[i] = this.children[i];
        }
        newChildren[this.children.length] = mathExpression;
        this.children = newChildren;
    }

    public int getResult() {
        int result = 0;
        for (MathExpression child : this.children) {
            result *= child.getResult();
        }
        return result;
    }
}
